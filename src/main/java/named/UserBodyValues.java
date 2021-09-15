package named;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBodyValues {
    private double kilogram;
    private double centimeter;
}
