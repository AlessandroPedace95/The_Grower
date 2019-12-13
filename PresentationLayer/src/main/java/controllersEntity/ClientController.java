package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntityImp.ClientServiceImp;

@RestController
public class ClientController {
    @Autowired
    ClientServiceImp clientService;
}
