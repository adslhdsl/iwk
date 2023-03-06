package iwk.domain;

import iwk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReviewModified extends AbstractEvent {

    private Long reviewId;
    private Long movieId;
    private String content;
}
