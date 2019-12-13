package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntityImp.CompanyServiceImp;

@RestController
public class CompanyController {
    @Autowired
    CompanyServiceImp companyService;
}
