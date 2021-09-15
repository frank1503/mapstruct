package custommethods;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDto {
    private String name;
    private double lengthInCentimeters;
}
