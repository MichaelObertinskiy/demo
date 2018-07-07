package com.antares.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MESSAGE")
public class Message implements Serializable {

    @Id
    @Column(name = "MESSAGE_ID")
    @GeneratedValue
    private Integer message_id;
    @Id
    @Column(name = "TASK_ID")
    private Integer task_id;
    @Id
    @Column(name = "USER_ID")
    private Integer user_id;

    public Message() {
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
