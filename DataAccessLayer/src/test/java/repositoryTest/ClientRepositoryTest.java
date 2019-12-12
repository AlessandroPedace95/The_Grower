package repositoryTest;

import static org.assertj.core.api.Assertions.assertThat;
import configuration.TestConfiguration;
import entity.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import repository.ClientRepository;

import java.util.ArrayList;
import java.util.Collection;

@DataJpaTest
@ContextConfiguration(classes = TestConfiguration.class)
public class ClientRepositoryTest {

    @Autowired
    ClientRepository clientRepository;

    Client client1 = Client.builder()
            .idClient(1)
            .name("Alessandro")
            .surname("Pedace")
            .taxCode("PDCLSN95S25D086X")
            .balance(11)
            .build();

    @BeforeEach
    void  setUpDB(){
        ArrayList<Client>  clients = new ArrayList<>();
        clients.add(client1);
        clientRepository.save(client1);
    }

    @Test
    void TestQuery() {
        Collection<Client> wealthy = clientRepository.findRichClients();
        assertThat(wealthy).contains(client1);
    }

}
