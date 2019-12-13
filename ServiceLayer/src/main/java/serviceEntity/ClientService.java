package serviceEntity;

import entity.Client;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface ClientService {
    public Client createClient(@Valid Client client);

    public Client getClientById(UUID id);

    public List<Client> getClients();

    public void deleteClientById(UUID id);

    public void deleteClient(Client client);
}
