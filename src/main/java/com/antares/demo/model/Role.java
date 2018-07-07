package com.antares.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

    @Id
    @Column(name = "ROLE_ID")
    private Integer role_id;
    @Id
    @Column(name = "NAME")
    private String name;

    public Role() {
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
