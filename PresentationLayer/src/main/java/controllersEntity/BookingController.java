package controllersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import serviceEntityImp.BookingServiceImp;

@RestController
public class BookingController {
    @Autowired
    BookingServiceImp bookingService;
}
