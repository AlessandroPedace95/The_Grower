package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import entity.vegetables.Vegetable;
import entity.vegetables.VegetableBooked;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private long idBooking;
    @NotNull
    @ManyToOne
    private Client client;
    @NotNull
    @ManyToOne
    private Land land;
    @NotNull
    @OneToMany(mappedBy = "booking")
    private Set<VegetableBooked> vegetables;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookingDate;
}
