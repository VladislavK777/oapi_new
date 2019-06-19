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
@Table(name = "product", schema = "lease_objects")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private String id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;
}
