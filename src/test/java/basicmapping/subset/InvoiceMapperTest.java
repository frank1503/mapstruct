package basicmapping.subset;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceMapperTest {

    @Test
    void maptToDtoTest() {
        //given
        Invoice invoice = Invoice.builder()
                .creditorName("creditor")
                .amountExclVat(BigDecimal.valueOf(11.11))
                .amountInclVat(BigDecimal.valueOf(15.55))
                .vatRate(BigDecimal.valueOf(4.44))
                .vatRateType("type1")
                .invoiced(false)
                .build();

        InvoiceDto expected = InvoiceDto.builder()
                .creditorName("creditor")
                .amountInclVat(BigDecimal.valueOf(15.55))
                .invoiced(false)
                .build();

        //when
        InvoiceDto result = InvoiceMapper.INSTANCE.mapToDto(invoice);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}