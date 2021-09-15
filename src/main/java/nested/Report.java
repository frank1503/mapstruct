package nested;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Report {
    private LocalDate dateOfReport;
    private String title;
    private Organisation organisation;
}
