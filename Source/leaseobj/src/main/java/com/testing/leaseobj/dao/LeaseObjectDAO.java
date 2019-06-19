package com.testing.leaseobj.dao;

import lombok.NonNull;

import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project leaseobj
 * @date 2019-06-18
 */

public interface LeaseObjectDAO {
    List getLeaseObject(@NonNull String clientUid, String equipmentUid, String productUid, String productStatus);
}
