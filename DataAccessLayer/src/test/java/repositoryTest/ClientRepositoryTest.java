package repositoryTest;

import static org.assertj.core.api.Assertions.assertThat;
import configuration.TestConfiguration;
import entity.Booking;
import entity.Client;
import entity.Company;
import entity.Land;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import repository.BookingRepository;
import repository.ClientRepository;
import repository.CompanyRepository;
import repository.LandRepository;

import java.util.Collection;
import java.util.Date;

@DataJpaTest
@ContextConfiguration(classes = TestConfiguration.class)
public class ClientRepositoryTest {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    LandRepository landRepository;
    @Autowired
    CompanyRepository companyRepository;

    @Test
    void TestQueryRichClients() {
        //ARRANGE
        Client client1 = Client.builder()
                .name("Alessandro")
                .surname("Pedace")
                .taxCode("PDCLSN95S25D086X")
                .balance(11)
                .build();

        Client client2 = Client.builder()
                .name("Alessandro")
                .surname("Pedace")
                .taxCode("PDCLSN95S25D086X")
                .balance(9)
                .build();
        clientRepository.saveAndFlush(client1);
        clientRepository.saveAndFlush(client2);
        //ACT
        Collection<Client> richClients = clientRepository.findRichClients();

        //ASSERT
        assertThat(richClients).contains(client1);
    }

    @Test
    void TestQueryNTTClient(){
        //ARRANGE
        Company company1 = Company.builder()
                .companyName("NTT")
                .vatNumber("123456789AZ")
                .build();

        companyRepository.save(company1);

        Land land1 = Land.builder()
                .landSize(12.5)
                .place("Cosenza")
                .company(company1)
                .build();

        landRepository.save(land1);

        Client client1 = Client.builder()
                .name("Alessandro")
                .surname("Pedace")
                .taxCode("PDCLSN95S25D086X")
                .balance(11)
                .build();

        Client client2 = Client.builder()
                .name("Giovanni")
                .surname("Rana")
                .taxCode("RNAGVN95S25D086X")
                .balance(15)
                .build();
        clientRepository.save(client1);
        clientRepository.save(client2);

        Booking booking1 = Booking.builder()
                .client(client1)
                .land(land1)
                .bookingDate(new Date(System.currentTimeMillis()))
                .build();

        Booking booking2 = Booking.builder()
                .client(client2)
                .land(land1)
                .bookingDate(new Date(System.currentTimeMillis()))
                .build();

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        //ACT

        Collection<Client> NTTClients = clientRepository.findNTTClients();

        //ASSERT
        assertThat(NTTClients).contains(client1);
    }

}
