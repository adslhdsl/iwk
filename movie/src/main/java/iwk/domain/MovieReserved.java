package iwk.domain;

import iwk.domain.*;
import iwk.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MovieReserved extends AbstractEvent {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private Integer numberOfSeats;

    public MovieReserved(Movie aggregate){
        super(aggregate);
    }
    public MovieReserved(){
        super();
    }
}
