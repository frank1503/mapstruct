package custommethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMapperTest {

    @Test
    void mapToCarTest() {
        //given
        PersonDto personDto = PersonDto.builder()
                .name("David")
                .lengthInCentimeters(185.6)
                .build();
        CarDto carDto = CarDto.builder()
                .brand("Ford")
                .driver(personDto)
                .build();

        Person expectedPerson = Person.builder()
                .name("David is the driver")
                .lengthInInches(185.6 * 0.3937)
                .build();
        Car expectedCar = Car.builder()
                .brand("Ford")
                .driver(expectedPerson)
                .build();

        //when
        Car result = CarMapper.INSTANCE.mapToCar(carDto);

        //then
        assertThat(expectedCar).isEqualToComparingFieldByFieldRecursively(result);
    }
}
