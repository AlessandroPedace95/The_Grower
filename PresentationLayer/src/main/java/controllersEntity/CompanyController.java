package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntity.CompanyService;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;
}
