package custommethods;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private double lengthInInches;
}
