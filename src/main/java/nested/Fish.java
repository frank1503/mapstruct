package nested;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fish {
    private String kind;
    private String name;
    private String color;
}
