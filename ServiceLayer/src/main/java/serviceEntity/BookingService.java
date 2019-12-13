package serviceEntity;

import entity.Booking;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface BookingService {
    public Booking createBooking(@Valid Booking booking);

    public Booking getBookingById(UUID id);

    public List<Booking> getBookings();

    public void deleteBooking(UUID id);

    public void deleteBooking(Booking booking);
}
