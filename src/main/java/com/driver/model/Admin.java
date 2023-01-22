package com.driver.model;


import javax.persistence.*;

@Entity
@Table(name = "admins")
public  class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    private String userName;

    private String passWord;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.userName = username;
        this.passWord = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }
}