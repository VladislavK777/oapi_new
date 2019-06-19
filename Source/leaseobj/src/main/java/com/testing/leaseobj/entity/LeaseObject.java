package com.testing.leaseobj.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Vladislav Klochkov
 * @project leaseobj
 * @date 2019-06-17
 */

@Data
@Entity
@Table(name = "lease_object", schema = "lease_objects")
public class LeaseObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private String id;

    @Column(name = "client_uid")
    private String clientUid;

    @Column(name = "equipment_uid")
    private String equipmentUid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_uid", referencedColumnName = "uid")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lease_contract_uid", referencedColumnName = "uid")
    private LeaseContract leaseContract;
}
