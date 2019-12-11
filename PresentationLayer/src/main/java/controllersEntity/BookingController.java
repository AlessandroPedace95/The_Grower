package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntity.BookingService;

@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;
}
