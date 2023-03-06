package iwk.domain;

import iwk.domain.*;
import iwk.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReviewCreated extends AbstractEvent {

    private Long reviewId;
    private String content;
    private Long movieId;
}


