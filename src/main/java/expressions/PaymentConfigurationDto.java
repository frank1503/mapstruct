package expressions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PaymentConfigurationDto {
    private Integer id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private String customerName;
    private int customerNumber;
}
