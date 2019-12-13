package serviceEntity;

import entity.Company;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface CompanyService {
    public Company createCompany(@Valid Company company);

    public Company getCompanyById(UUID id);

    public List<Company> getCompany();

    public void deleteCompanyById(UUID id);

    public void deleteCompany(Company company);
}
