package severalsourceparameters;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillableItem {
    private double amount;
}
