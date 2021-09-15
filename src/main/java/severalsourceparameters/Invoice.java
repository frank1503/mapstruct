package severalsourceparameters;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Invoice {
    private String name;
    private String street;
    private int houseNumber;
    private double invoiceAmount;
}
