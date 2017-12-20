package com.springboot.entity;


import javax.persistence.*;

/**
 * Created by 文江 on 2017/12/20.
 */
@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "email")
    private String email;
    @Column(name ="password" )
    private String password;
    @Column(name ="username" )
    private String username;

    public int getId() {
        return Id;
    }
    @Column(name = "id")
    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }
    @Column(name = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    @Column(name = "password")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    @Column(name = "username")
    public void setUsername(String username) {
        this.username = username;
    }
}
