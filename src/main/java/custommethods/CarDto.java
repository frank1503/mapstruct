package custommethods;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private String brand;
    private PersonDto driver;
}
