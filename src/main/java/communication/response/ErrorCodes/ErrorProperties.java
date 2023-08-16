package communication.response.ErrorCodes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorProperties {
    @JsonProperty("type")
    private String type;
    @JsonProperty("instance")
    private String instance;
    @JsonProperty("status")
    private String status;
    @JsonProperty("title")
    private String title;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("error")
    private String error;
    @JsonProperty("path")
    private String path;
    @JsonProperty("violations")
    private List<Violations> violations;
}
