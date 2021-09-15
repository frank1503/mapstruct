package nested;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FishTank {
    private double volume;
    private Fish fish;
    private String ornament;
    private Material material;
    private Quality quality;
}
