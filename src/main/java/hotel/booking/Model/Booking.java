package hotel.booking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {
    //@Generated
    @Id
    private int bookingId;
    private long mobileNo;
    private String hotelName;
    private Date fromDate;
    private Date toDate;

}
