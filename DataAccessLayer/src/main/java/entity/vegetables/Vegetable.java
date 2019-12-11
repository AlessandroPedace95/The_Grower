package entity.vegetables;

import entity.Land;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class Vegetable {

    @Id
    private int idVegetable;
    @NotNull
    private String name;
    @NotNull
    private double price;
    @NotNull
    @ManyToOne
    @JoinColumn(unique = true)
    private Land land;

    @OneToMany(mappedBy = "vegetable")
    private Set<VegetableBooked> booking;

}
