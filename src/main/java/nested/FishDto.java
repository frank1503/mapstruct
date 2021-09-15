package nested;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FishDto {
    private String type;
    private String color;
}
