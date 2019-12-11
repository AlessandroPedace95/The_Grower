package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntity.LandService;

@RestController
public class LandController {
    @Autowired
    LandService landService;
}
