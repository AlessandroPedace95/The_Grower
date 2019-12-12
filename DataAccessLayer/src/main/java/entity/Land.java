package entity;

import entity.vegetables.Vegetable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
public class Land {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID idLand;
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
