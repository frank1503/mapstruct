package nested;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InteriorDto {
    private String ornament;
    private String color;
}
