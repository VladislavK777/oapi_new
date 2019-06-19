package com.testing.leaseobj.dao;

import com.testing.leaseobj.entity.LeaseObject;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project leaseobj
 * @date 2019-06-18
 */

@Repository
public class LeaseObjectDAOImpl implements LeaseObjectDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getLeaseObject(@NonNull String clientUid, String equipmentUid, String productUid, String productStatus) {
        return entityManager
                .createStoredProcedureQuery("lease_objects.get_lease_object", LeaseObject.class)
                .registerStoredProcedureParameter("clientUid", String.class, ParameterMode.IN)
                .setParameter("clientUid", clientUid)
                .getResultList();
    }
}
