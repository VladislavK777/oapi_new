package com.testing.equipment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Vladislav Klochkov
 * @project equipment
 * @date 2019-06-17
 */

@Data
@Entity
@Table(name = "equipment", schema = "equipments")
public class Equipment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "type")
    private String type;

    @Column(name = "view")
    private String view;

    @Column(name = "pre_view")
    private String preView;

    @Column(name = "category")
    private String category;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "model_uid", referencedColumnName = "uid")
    private Model model;
}
