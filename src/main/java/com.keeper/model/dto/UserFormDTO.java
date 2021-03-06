package com.keeper.model.dto;

/*
 * Created by @GoodforGod on 19.04.2017.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Default Comment
 */
public class UserFormDTO {

    @NotEmpty private String name;
    @Email private String email;
    @NotEmpty private String password;
//    @NotEmpty private String passwordRepeted;

    //<editor-fold desc="GetterAndSetter">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getPasswordRepeted() {
//        return passwordRepeted;
//    }
//
//    public void setPasswordRepeted(String passwordRepeted) {
//        this.passwordRepeted = passwordRepeted;
//    }
    //</editor-fold>
}
