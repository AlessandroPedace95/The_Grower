package serviceEntity;

import entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

import javax.validation.Valid;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client createClient(@Valid Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(long id) {
        return clientRepository.getOne(id);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }
}
