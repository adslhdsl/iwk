package iwk.domain;

import iwk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class MovieRegistered extends AbstractEvent {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private Integer numberOfSeats;
    private Long customerId;
    private Date startDate;
    private Date endDate;
}
