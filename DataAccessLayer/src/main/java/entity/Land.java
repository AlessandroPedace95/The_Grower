package entity;

import entity.vegetables.Vegetable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Land {
    @Id
    @GeneratedValue
    private long idLand;

    @NotNull
    private String place;
    @NotNull
    private double landSize;
    @NotNull
    @ManyToOne
    private Company company;
    @OneToMany
    private List<Vegetable> vegetables;
    @OneToMany
    private  List<Booking> bookings;
}
