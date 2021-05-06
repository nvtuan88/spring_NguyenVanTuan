package com.nguyenvantuan.nguyenvantuan.entity;

import javax.persistence.*;

@Entity
@Table(name = "name")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column

    private String user;

    @Column
    private String passs;

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasss() {
        return passs;
    }

    public void setPasss(String passs) {
        this.passs = passs;
    }
}
