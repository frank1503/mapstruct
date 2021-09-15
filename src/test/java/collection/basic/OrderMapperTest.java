package collection.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OrderMapperTest {

    @Test
    void mapToOrderTest() {
        //given
        OrderDto orderDto = OrderDto.builder()
                .products(List.of(ProductDto.builder().price(12.5).build(),
                        ProductDto.builder().price(25.6).build()))
                .build();

        Order expected = Order.builder()
                .products(List.of(Product.builder().price(12.5).build(),
                        Product.builder().price(25.6).build()))
                .build();

        //when
        Order result = OrderMapper.INSTANCE.mapToOrder(orderDto);

        //then
        assertThat(result).isEqualToComparingFieldByFieldRecursively(expected);
    }
}