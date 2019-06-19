package com.testing.leaseobj.model_in;

import lombok.Data;

/**
 * @author Vladislav Klochkov
 * @project leaseobj
 * @date 2019-06-18
 */

@Data
public class LeaseObjectBody {
    private String equipmentUid;
    private String clientUid;
    private String productUid;
    private String productStatus;

}
