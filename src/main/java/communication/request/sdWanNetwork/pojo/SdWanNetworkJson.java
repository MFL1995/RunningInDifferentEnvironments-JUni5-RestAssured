package communication.request.sdWanNetwork.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SdWanNetworkJson {
    @JsonProperty("locked")
    private String locked;
}
