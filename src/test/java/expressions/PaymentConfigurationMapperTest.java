package expressions;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentConfigurationMapperTest {
    LocalDate startDate = LocalDate.of(2021, 9, 9);
    LocalDate endDate = LocalDate.of(2022, 9, 9);
    String type = "splitbilling";
    String name = "Roel";
    int number = 123;

    @Test
    void mapToPaymentConfigurationTest_Added() {

        //given

        PaymentConfigurationDto dto = PaymentConfigurationDto.builder()
                .id(null)
                .endDate(endDate)
                .startDate(startDate)
                .type(type)
                .customerNumber(number)
                .customerName(name)
                .build();

        PaymentConfiguration expected = PaymentConfiguration.builder()
                .added(true)
                .startDate(startDate)
                .endDate(endDate)
                .type(type)
                .customer(Customer.builder()
                        .name(name)
                        .customerNumber(number)
                        .build())
                .build();

        //when
        PaymentConfiguration result = PaymentConfigurationMapper.INSTANCE.mapToPaymentConfiguration(dto);

        //then
        assertThat(result).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    void mapToPaymentConfigurationTest_NotAdded() {
        //given
        PaymentConfigurationDto dto = PaymentConfigurationDto.builder()
                .id(1)
                .endDate(endDate)
                .startDate(startDate)
                .type(type)
                .customerNumber(number)
                .customerName(name)
                .build();

        PaymentConfiguration expected = PaymentConfiguration.builder()
                .added(false)
                .startDate(startDate)
                .endDate(endDate)
                .type(type)
                .customer(Customer.builder()
                        .name(name)
                        .customerNumber(number)
                        .build())
                .build();

        //when
        PaymentConfiguration result = PaymentConfigurationMapper.INSTANCE.mapToPaymentConfiguration(dto);

        //then
        assertThat(result).isEqualToComparingFieldByFieldRecursively(expected);
    }
}