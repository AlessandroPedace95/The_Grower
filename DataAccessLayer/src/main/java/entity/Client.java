package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder(toBuilder = true)
@Entity
public class Client {
    @Id
    @GeneratedValue
    private long idClient;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    @Size(min = 16,max = 16,message = "The tax code must be exactly 16 digits")
    private String taxCode;
    @NotNull
    private double balance;
    @OneToMany
    private List<Booking> bookings;
}
