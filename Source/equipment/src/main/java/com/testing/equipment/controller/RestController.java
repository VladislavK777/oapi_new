package com.testing.equipment.controller;

import com.testing.equipment.dao.EquipmentDAOImpl;
import com.testing.equipment.entity.Equipment;
import com.testing.equipment.model_in.EquipmentBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * @author Vladislav Klochkov
 * @project equipment
 * @date 2019-06-17
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private EquipmentDAOImpl equipmentDAO;

    @PostMapping(value = "/equipment", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getEquipment(@RequestBody EquipmentBody equipmentBody) {
        List result;
        if (equipmentBody.getUid().equals("")) {
            result = equipmentDAO.getEquipmentAll();
        } else {
            result = equipmentDAO.getEquipment(equipmentBody.getUid());
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
