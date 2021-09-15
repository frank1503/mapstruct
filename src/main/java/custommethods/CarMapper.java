package custommethods;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car mapToCar(CarDto carDto);

    default Person mapToPerson(PersonDto personDto) {
        return Person.builder()
                .name(personDto.getName().concat(" is the driver"))
                .lengthInInches(personDto.getLengthInCentimeters() * 0.3937)
                .build();
    }
}
