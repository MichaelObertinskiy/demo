package com.antares.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task implements Serializable {

    @Id
    @Column(name = "TASK_ID")
    @GeneratedValue
    private Integer task_id;
    @Id
    @Column(name = "OWNER_ID")
    private Integer owner_id;
    @Id
    @Column(name = "ASSIGNER_ID")
    private Integer assignner_id;
    @Id
    @Column(name = "DESCRIPTION")
    private String description;
    @Id
    @Column(name = "RATING")
    private Integer rating;
    @Id
    @Column(name = "COAST")
    private Float cost;
    @Id
    @Column(name = "DEADLINE")
    private Date deadline;

    public Task() {
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getAssignner_id() {
        return assignner_id;
    }

    public void setAssignner_id(Integer assignner_id) {
        this.assignner_id = assignner_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
