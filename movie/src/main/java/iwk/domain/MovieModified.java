package iwk.domain;

import iwk.domain.*;
import iwk.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MovieModified extends AbstractEvent {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private Integer numberOfSeats;
    private Long customerId;
    private Date startDate;
    private Date endDate;

    public MovieModified(Movie aggregate){
        super(aggregate);
    }
    public MovieModified(){
        super();
    }
}
