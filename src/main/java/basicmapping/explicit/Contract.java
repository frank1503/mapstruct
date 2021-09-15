package basicmapping.explicit;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Contract {
    private LocalDate startDate;
    private LocalDate endDate;
}
