package named;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserBodyValuesMapperTest {

    @Test
    void userBodyValuesMapperTest() {
        //given
        UserBodyImperialValuesDto dto = UserBodyImperialValuesDto.builder()
                .inch(70)
                .pound(130)
                .build();

        UserBodyValues expected = UserBodyValues.builder()
                .centimeter(177.8)
                .kilogram(58.5)
                .build();

        //when
        UserBodyValues result = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        //then
        assertThat(result).isEqualToComparingFieldByField(result);
    }
}