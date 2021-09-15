package basicmapping.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarMapperTest {

    @Test
    void mapToCarTest() {
        //given
        CarDto dto = CarDto.builder()
                .brand("Ferrari")
                .color("red")
                .topSpeed(320.5)
                .build();

        Car expected = Car.builder()
                .brand("Ferrari")
                .color("red")
                .topSpeed(320.5)
                .build();

        //when
        Car result = CarMapper.INSTANCE.mapToCar(dto);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

    @Test
    void mapToDtoTest() {
        //given
        Car car = Car.builder()
                .brand("Ferrari")
                .color("red")
                .topSpeed(320.5)
                .build();

        CarDto expected = CarDto.builder()
                .brand("Ferrari")
                .color("red")
                .topSpeed(320.5)
                .build();

        //when
        CarDto result = CarMapper.INSTANCE.mapToDto(car);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

}