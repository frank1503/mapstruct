package collection.basic;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private List<Product> products;
}
