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
@Table(name = "lease_contract", schema = "lease_objects")
public class LeaseContract implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private String id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "cost")
    private float cost;
}
