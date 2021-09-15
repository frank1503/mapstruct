package nested;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class QualityDto {
    private boolean qualityApproved;
    private LocalDate dateOfApproval;
    private ReportDto report;
}
