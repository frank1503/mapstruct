package severalsourceparameters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InvoiceMapper {

    InvoiceMapper INSTANCE = Mappers.getMapper(InvoiceMapper.class);

    @Mapping(source = "address.streetName", target = "street")
    @Mapping(source = "address.houseNum", target = "houseNumber")
    @Mapping(source = "billableItem.amount", target = "invoiceAmount")
    Invoice mapToInvoice(Person person, Address address, BillableItem billableItem);
}
