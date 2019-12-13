package serviceEntity;

import entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CompanyRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(@Valid Company azienda) {
        return companyRepository.save(azienda);
    }

    public Company getCompanyById(UUID id) {
        return companyRepository.getOne(id);
    }

    public List<Company> getCompany() {
        return companyRepository.findAll();
    }

    public void deleteCompanyById(UUID id) {
        companyRepository.deleteById(id);
    }

    public void deleteCompany(Company company) {companyRepository.delete(company);}
}
