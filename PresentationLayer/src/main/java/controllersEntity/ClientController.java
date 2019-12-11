package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntity.ClientService;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;
}
