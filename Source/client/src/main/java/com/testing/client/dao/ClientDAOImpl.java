package com.testing.client.dao;

import lombok.NonNull;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project client
 * @date 2019-06-17
 */

@Repository
public class ClientDAOImpl implements ClientDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getContractor(@NonNull String uid) {
        return entityManager.createQuery("from Contractor c where c.uid = :uid")
                .setParameter("uid", uid).getResultList();
    }
}
