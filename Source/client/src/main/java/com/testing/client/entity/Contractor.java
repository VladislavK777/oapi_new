package com.testing.client.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Vladislav Klochkov
 * @project client
 * @date 2019-06-17
 */

@Data
@Entity
@Table(name = "contractor", schema = "clients")
public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "inn")
    private long inn;

    @Column(name = "uid")
    private String uid;
}
