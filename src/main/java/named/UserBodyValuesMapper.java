package named;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBodyValuesMapper {

    UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);

    @Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
    @Mapping(source = "pound", target = "kilogram", qualifiedByName = "poundToKilogram")
    UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDto dto);

    @Named("inchToCentimeter")
    default double inchToCentimeter(int inch) {
        return inch * 2.54;
    }

    @Named("poundToKilogram")
    default double poundToKilogram(int pound) {
        return pound * 0.45;
    }
}
