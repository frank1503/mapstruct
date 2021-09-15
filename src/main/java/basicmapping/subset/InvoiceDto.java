package basicmapping.subset;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class InvoiceDto {
    private String creditorName;
    private BigDecimal amountInclVat;
    private boolean invoiced;
}
