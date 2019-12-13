package serviceEntityImp;

import org.springframework.transaction.annotation.Transactional;
import serviceEntity.ClientService;
import entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Transactional
    public Client createClient(@Valid Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(UUID id) {
        return clientRepository.getOne(id);
    }

    @Transactional
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public void deleteClientById(UUID id) {
        clientRepository.deleteById(id);
    }

    @Transactional
    public void deleteClient(Client client) {clientRepository.delete(client);}
}
