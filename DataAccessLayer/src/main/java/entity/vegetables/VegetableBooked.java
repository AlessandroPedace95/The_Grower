package entity.vegetables;

import entity.Booking;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class VegetableBooked {
    @EmbeddedId
    VegetableBookedID id;

    @ManyToOne
    @MapsId("idBooking")
    @JoinColumn(name = "booking")
    Booking booking;

    @ManyToOne
    @MapsId("idVegetable")
    @JoinColumn(name = "vegetable")
    Vegetable vegetable;

    int quantity;

}
