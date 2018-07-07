package com.antares.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ATTACH2TASK")
public class Attach2Task implements Serializable {

    @Id
    @Column(name = "ATTACH_2_TASK_ID")
    @GeneratedValue
    private Integer attach_2_Task_id;
    @Id
    @Column(name = "ATTACH_ID")
    private Integer attach_id;
    @Id
    @Column(name = "TASK_ID")
    private Integer tack_id;

    public Attach2Task() {
    }

    public Integer getAttach_2_Task_id() {
        return attach_2_Task_id;
    }

    public void setAttach_2_Task_id(Integer attach_2_Task_id) {
        this.attach_2_Task_id = attach_2_Task_id;
    }

    public Integer getAttach_id() {
        return attach_id;
    }

    public void setAttach_id(Integer attach_id) {
        this.attach_id = attach_id;
    }

    public Integer getTack_id() {
        return tack_id;
    }

    public void setTack_id(Integer tack_id) {
        this.tack_id = tack_id;
    }
}
