package basicmapping.lombok;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car mapToCar(CarDto carDto);

    CarDto mapToDto(Car car);
}
