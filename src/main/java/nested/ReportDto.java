package nested;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ReportDto {
    private LocalDate dateOfReport;
    private String title;
    private String organisationName;
}
