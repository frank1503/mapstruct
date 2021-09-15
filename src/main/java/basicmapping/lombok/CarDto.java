package basicmapping.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private String brand;
    private String color;
    private double topSpeed;
}
