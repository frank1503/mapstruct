package expressions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PaymentConfiguration {
    private boolean added;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private Customer customer;
}
