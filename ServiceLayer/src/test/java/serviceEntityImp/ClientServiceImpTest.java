package serviceEntityImp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import entity.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;
import repository.ClientRepository;
import serviceEntity.ClientService;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ClientServiceImpTest {
    @Mock
    ClientRepository clientRepository;

    @InjectMocks
    ClientServiceImp clientService;

    @Test
    void createClient() {
        //ARRANGE
        Client client1 = Client.builder()
                .name("Alessandro")
                .surname("Pedace")
                .taxCode("PDCLSN95S25D086X")
                .balance(11)
                .build();

        //ACT
        clientService.createClient(client1);

        //ASSERT
        verify(clientRepository).save(client1);
    }

    @Test
    void getClients() {
        //ARRANGE

        //ACT
        clientService.getClients();

        //ASSERT
        verify(clientRepository).findAll();

    }

    @Test
    void deleteClient() {
        //ARRANGE
        Client client1 = Client.builder()
                .name("Alessandro")
                .surname("Pedace")
                .taxCode("PDCLSN95S25D086X")
                .balance(11)
                .build();
        //ACT
        clientService.createClient(client1);
        clientService.deleteClient(client1);
        //ASSERT
        verify(clientRepository).delete(client1);
    }
}