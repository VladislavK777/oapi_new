package com.testing.leaseobj.controller;

import com.testing.leaseobj.dao.LeaseObjectDAOImpl;
import com.testing.leaseobj.model_in.LeaseObjectBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;
import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project leaseobj
 * @date 2019-06-18
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    LeaseObjectDAOImpl leaseObjectDAO;

    @PostMapping(value = "/object", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getIbject(@RequestBody LeaseObjectBody leaseObjectBody) {
        List result = leaseObjectDAO.getLeaseObject(leaseObjectBody.getClientUid(), leaseObjectBody.getEquipmentUid(), leaseObjectBody.getProductUid(), leaseObjectBody.getProductStatus());
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
