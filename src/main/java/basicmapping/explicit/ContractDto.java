package basicmapping.explicit;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ContractDto {
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
}
