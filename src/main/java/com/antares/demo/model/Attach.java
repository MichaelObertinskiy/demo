

package com.antares.demo.model;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;


@Entity
@Table(name = "ATTACH")
public class Attach implements Serializable {

    @Id
    @Column(name = "ATACH_ID")
    @GeneratedValue
    private Integer attach_id;
    @Column(name = "FILE")
    private File file;

    public Attach() {
    }

    public Integer getAttach_id() {
        return attach_id;
    }

    public void setAttach_id(Integer attach_id) {
        this.attach_id = attach_id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
