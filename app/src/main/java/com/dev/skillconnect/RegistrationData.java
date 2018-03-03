package com.dev.skillconnect;

/**
 * Created by prashant on 3/3/18.
 */

public class RegistrationData {
    String Fname, Lname, email, mobile, username, password;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegistrationData(String fname, String lname, String email, String mobile, String username, String password) {
        Fname = fname;
        Lname = lname;
        this.email = email;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
}
