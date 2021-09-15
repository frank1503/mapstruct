package basicmapping.implicit;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person mapToPerson(PersonDto personDto);

    PersonDto mapToDto(Person person);
}
