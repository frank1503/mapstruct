package basicmapping.explicit;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractMapper {

    ContractMapper INSTANCE = Mappers.getMapper(ContractMapper.class);

    @Mapping(source = "contractStartDate", target = "startDate")
    @Mapping(source = "contractEndDate", target = "endDate")
    Contract mapToContract(ContractDto contractDto);

    @Mapping(source = "startDate", target = "contractStartDate")
    @Mapping(source = "endDate", target = "contractEndDate")
    ContractDto mapToDto(Contract contract);
}
