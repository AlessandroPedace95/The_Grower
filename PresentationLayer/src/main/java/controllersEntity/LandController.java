package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntityImp.LandServiceImp;

@RestController
public class LandController {
    @Autowired
    LandServiceImp landService;
}
