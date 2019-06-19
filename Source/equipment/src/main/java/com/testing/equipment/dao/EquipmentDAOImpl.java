package com.testing.equipment.dao;

import lombok.NonNull;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project equipment
 * @date 2019-06-17
 */

@Repository
public class EquipmentDAOImpl implements EquipmentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getEquipmentAll() {
        return entityManager
                .createQuery("from Equipment")
                .getResultList();
    }

    @Override
    public List getEquipment(@NonNull String uid) {
        return entityManager
                .createQuery("from Equipment where uid = :uid")
                .setParameter("uid", uid)
                .getResultList();
    }
}
