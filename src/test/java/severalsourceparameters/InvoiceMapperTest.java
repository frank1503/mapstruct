package severalsourceparameters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceMapperTest {

    @Test
    void mapToInvoiceTest() {
        //given
        Person person = Person.builder()
                .name("Roel")
                .age(50)
                .build();
        Address address = Address.builder()
                .streetName("street")
                .houseNum(1)
                .build();
        BillableItem billableItem = BillableItem.builder()
                .amount(123.5)
                .build();

        Invoice expected = Invoice.builder()
                .name("Roel")
                .street("street")
                .houseNumber(1)
                .invoiceAmount(123.5)
                .build();

        //when
        Invoice result = InvoiceMapper.INSTANCE.mapToInvoice(person, address, billableItem);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}
