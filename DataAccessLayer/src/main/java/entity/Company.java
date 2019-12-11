package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue
    private long idCompany;
    @NotNull
    private String companyName;
    @NotNull
    @Size(min = 11, max = 11, message = "the VAT number must be 11 digits")
    private String vatNumber;
    @OneToMany
    private List<Land> lands;
    private int numberLands = 0;
}
