package com.antares.demo.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "NAME")
public class User implements Serializable {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private Integer user_id;
    @Id
    @Column(name = "ROLE_ID")
    private Integer role_id;
    @Id
    @Column(name = "LOGIN")
    private String login;
    @Id
    @Column(name = "PASSWORD")
    private String password;
    @Id
    @Column(name = "EMAIL")
    private String email;
    @Id
    @Column(name = "BALANCE")
    private Float balance;
    @Id
    @Column(name = "RATING")
    private Integer rating;

    public User() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
