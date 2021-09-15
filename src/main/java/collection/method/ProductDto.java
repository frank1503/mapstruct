package collection.method;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {
    private double priceInEuros;
}
