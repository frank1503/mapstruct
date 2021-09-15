package collection.method;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "productDtos", target = "products")
    Order mapToOrder(OrderDto orderDto);

    default Product mapToProduct(ProductDto productDto) {
        return Product.builder()
                .priceInDollars(productDto.getPriceInEuros() * 1.18)
                .build();
    }
}
