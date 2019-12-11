package serviceEntity;

import entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookingRepository;

import javax.validation.Valid;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(@Valid Booking booking) {

        return bookingRepository.save(booking);
    }

    public Booking getBookingById(long id) {
        return bookingRepository.getOne(id);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public void deleteBooking(long id) {
        bookingRepository.deleteById(id);
    }
}
