package named;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBodyImperialValuesDto {
    private int inch;
    private int pound;
}
