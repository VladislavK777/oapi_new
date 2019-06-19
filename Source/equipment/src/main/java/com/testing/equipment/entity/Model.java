package com.testing.equipment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Vladislav Klochkov
 * @project equipment
 * @date 2019-06-17
 */

@Data
@Entity
@Table(name = "model", schema = "equipments")
public class Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @Column(name = "uid")
    @JsonIgnore
    private String uid;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mark_uid", referencedColumnName = "uid")
    private Mark mark;

}
