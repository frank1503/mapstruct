package type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonMapperTest {

    @Test
    void mapToPerson() {
        //given
        PersonDto personDto = PersonDto.builder()
                .age("35")
                .build();

        Person expected = Person.builder()
                .age(35)
                .build();

        //when
        Person result = PersonMapper.INSTANCE.mapToPerson(personDto);

        //then
        assertThat(result).isEqualToComparingFieldByField(expected);

    }
}
