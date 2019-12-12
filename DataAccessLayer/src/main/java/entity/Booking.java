package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import entity.vegetables.Vegetable;
import entity.vegetables.VegetableBooked;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
public class Booking {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID idBooking;
    @NotNull
    @ManyToOne
    private Client client;
    @NotNull
    @ManyToOne
    private Land land;
    //@NotNull
    @OneToMany(mappedBy = "booking")
    private Set<VegetableBooked> vegetables;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookingDate;
}
