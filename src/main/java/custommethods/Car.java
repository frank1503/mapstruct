package custommethods;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String brand;
    private Person driver;
}
