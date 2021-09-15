package nomapstruct;

public class PersonMapper {

    public Person mapToPerson(PersonDto personDto) {
        Person person = new Person();

        Address address = new Address();
        address.setCity(personDto.getAddressDto().getCity());
        address.setHouseNumber(personDto.getAddressDto().getHouseNumber());
        address.setStreet(personDto.getAddressDto().getStreet());
        address.setZipcode(personDto.getAddressDto().getZipcode());

        person.setName(person.getName());
        person.setDateOfBirth(personDto.getDateOfBirth());
        person.setAddress(address);

        return person;
    }

}










