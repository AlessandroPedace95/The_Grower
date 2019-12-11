package entity.vegetables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class VegetableBookedID implements Serializable {
    private long idBooking;

    private  int idVegetable;
}
