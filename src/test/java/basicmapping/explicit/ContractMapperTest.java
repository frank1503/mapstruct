package basicmapping.explicit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ContractMapperTest {

    @Test
    void mapToContract() {
        //given
        ContractDto dto = ContractDto.builder()
                .contractStartDate(LocalDate.of(2020, 1, 1))
                .contractEndDate(LocalDate.of(2021, 12, 31))
                .build();

        Contract expected = Contract.builder()
                .startDate(LocalDate.of(2020, 1, 1))
                .endDate(LocalDate.of(2021, 12, 31))
                .build();

        //when
        Contract result = ContractMapper.INSTANCE.mapToContract(dto);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

    @Test
    void mapToDto() {
        //given
        Contract contract = Contract.builder()
                .startDate(LocalDate.of(2020, 1, 1))
                .endDate(LocalDate.of(2021, 12, 31))
                .build();

        ContractDto expected = ContractDto.builder()
                .contractStartDate(LocalDate.of(2020, 1, 1))
                .contractEndDate(LocalDate.of(2021, 12, 31))
                .build();

        //when
        ContractDto result = ContractMapper.INSTANCE.mapToDto(contract);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}
