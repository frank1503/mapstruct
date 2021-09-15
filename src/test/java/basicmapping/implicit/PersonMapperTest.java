package basicmapping.implicit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonMapperTest {

    @Test
    void mapToPersonTest() {
        //given
        PersonDto dto = new PersonDto();
        dto.setName("Jaap");
        dto.setDateOfBirth(LocalDate.of(1980, 1, 2));
        dto.setGender("M");
        dto.setHeight(1.83);

        Person expected = new Person();
        expected.setName("Jaap");
        expected.setDateOfBirth(LocalDate.of(1980, 1, 2));
        expected.setGender("M");
        expected.setHeight(1.83);

        //when
        Person result = PersonMapper.INSTANCE.mapToPerson(dto);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

    @Test
    void mapToDtoTest() {
        //given
        Person person = new Person();
        person.setName("Jaap");
        person.setDateOfBirth(LocalDate.of(1980, 1, 2));
        person.setGender("M");
        person.setHeight(1.83);

        PersonDto expected = new PersonDto();
        expected.setName("Jaap");
        expected.setDateOfBirth(LocalDate.of(1980, 1, 2));
        expected.setGender("M");
        expected.setHeight(1.83);

        //when
        PersonDto result = PersonMapper.INSTANCE.mapToDto(person);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}
