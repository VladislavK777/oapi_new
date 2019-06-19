package com.testing.client.controller;

import com.testing.client.dao.ClientDAOImpl;
import com.testing.client.model_in.ClientBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project client
 * @date 2019-06-17
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ClientDAOImpl clientDAO;

    @PostMapping(value = "/client", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getClient(@RequestBody ClientBody clientBody) {
        List result = clientDAO.getContractor(clientBody.getUid());
        if (result.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
