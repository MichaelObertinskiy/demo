package com.antares.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ATTACHMESSAGE")
public class AttachMessage implements Serializable {

    @Id
    @Column(name = "ATTACH_MESSAGE_ID")
    @GeneratedValue
    private Integer attach_Message_id;
    @Id
    @Column(name = "ATTACH_ID")
    private Integer attach_id;
    @Id
    @Column(name = "MESSAGE_ID")
    private Integer message_id;

    public AttachMessage() {
    }

    public Integer getAttach_Message_id() {
        return attach_Message_id;
    }

    public void setAttach_Message_id(Integer attach_Message_id) {
        this.attach_Message_id = attach_Message_id;
    }

    public Integer getAttach_id() {
        return attach_id;
    }

    public void setAttach_id(Integer attach_id) {
        this.attach_id = attach_id;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }
}
