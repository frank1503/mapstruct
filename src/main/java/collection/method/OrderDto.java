package collection.method;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderDto {
    private List<ProductDto> productDtos;
}
