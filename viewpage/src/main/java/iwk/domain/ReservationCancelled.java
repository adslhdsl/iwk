package iwk.domain;

import iwk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReservationCancelled extends AbstractEvent {

    private Long rsvId;
    private Long movieId;
    private String status;
    private Long payId;
    private Long customerId;
}
