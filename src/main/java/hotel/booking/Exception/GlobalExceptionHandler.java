package hotel.booking.Exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Configuration
public class GlobalExceptionHandler {
    @ExceptionHandler(HotelBookingIdNotFoundException.class)
    public String add()
    {
        return "Booking Id not exists";
    }


}
