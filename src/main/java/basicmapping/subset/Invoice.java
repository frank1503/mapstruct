package basicmapping.subset;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Invoice {
    private String creditorName;
    private BigDecimal amountExclVat;
    private BigDecimal amountInclVat;
    private BigDecimal vatRate;
    private String vatRateType;
    private boolean invoiced;
}
