package communication.request.sdWanNetwork.builder;

import communication.request.sdWanNetwork.pojo.SdWanNetworkJson;

public class SdWanNetworkBuilder {
    public static SdWanNetworkJson siteLockRequest(String lockSiteTrue) {
        return SdWanNetworkJson.builder()
                .locked(lockSiteTrue)
                .build();
    }
}
