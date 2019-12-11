package serviceEntity;

import entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CompanyRepository;

import javax.validation.Valid;
import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(@Valid Company azienda) {
        return companyRepository.save(azienda);
    }

    public Company getCompanyById(long id) {
        return companyRepository.getOne(id);
    }

    public List<Company> getCompany() {
        return companyRepository.findAll();
    }

    public void deleteCompany(long id) {
        companyRepository.deleteById(id);
    }
}
