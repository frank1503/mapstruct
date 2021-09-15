package nested;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FishTankDto {
    private double volume;
    private FishDto fish;
    private InteriorDto interior;
    private String material;
    private QualityDto quality;
}
