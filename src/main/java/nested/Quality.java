package nested;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Quality {
    private boolean qualityApproved;
    private LocalDate dateOfApproval;
    private Report report;
}
