package collection.method;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderMapperTest {

    @Test
    void mapToOrderTest() {
        //given
        OrderDto orderDto = OrderDto.builder()
                .productDtos(List.of(ProductDto.builder().priceInEuros(12.5).build(),
                        ProductDto.builder().priceInEuros(18.5).build()))
                .build();

        Order expected = Order.builder()
                .products(List.of(Product.builder().priceInDollars(14.75).build(),
                        Product.builder().priceInDollars(21.83).build()))
                .build();

        //when
        Order result = OrderMapper.INSTANCE.mapToOrder(orderDto);

        //then
        assertThat(result).isEqualToComparingFieldByFieldRecursively(expected);

    }
}
