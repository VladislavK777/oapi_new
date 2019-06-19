package com.testing.equipment.dao;

import lombok.NonNull;

import java.util.List;

/**
 * @author Vladislav Klochkov
 * @project equipment
 * @date 2019-06-17
 */

public interface EquipmentDAO {
    List getEquipmentAll();
    List getEquipment(@NonNull String uid);
}
