package expressions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentConfigurationMapper {

    PaymentConfigurationMapper INSTANCE = Mappers.getMapper(PaymentConfigurationMapper.class);

    @Mapping(target = "added", expression = "java(dto.getId() == null ? true : false)")
    @Mapping(target = "customer", expression = "java(new Customer(dto.getCustomerName(), dto.getCustomerNumber()))")
    PaymentConfiguration mapToPaymentConfiguration(PaymentConfigurationDto dto);
}
