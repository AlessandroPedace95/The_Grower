package serviceEntityImp;

import serviceEntity.BookingService;
import entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookingRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
public class BookingServiceImp implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(@Valid Booking booking) {

        return bookingRepository.save(booking);
    }

    public Booking getBookingById(UUID id) {
        return bookingRepository.getOne(id);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public void deleteBooking(UUID id) {
        bookingRepository.deleteById(id);
    }

    public void deleteBooking(Booking booking) { bookingRepository.delete(booking);}
}
