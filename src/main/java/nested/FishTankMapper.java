package nested;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FishTankMapper {

    FishTankMapper INSTANCE = Mappers.getMapper(FishTankMapper.class);

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", ignore = true)
    @Mapping(target = "ornament", source = "interior.ornament")
    @Mapping(target = "material.materialType", source = "material")
    @Mapping(target = "quality.report.organisation.name", source = "quality.report.organisationName")
    FishTank mapToFishTank(FishTankDto fishTankDto);
}
