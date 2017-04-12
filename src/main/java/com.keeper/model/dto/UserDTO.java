package com.keeper.model.dto;

/*
 * Created by @GoodforGod on 6.04.2017.
 */

import com.keeper.model.states.UserState;
import com.keeper.model.types.UserType;
import com.keeper.util.Converter;

import java.time.LocalDateTime;

/**
 * Default Comment
 */
public class UserDTO {

    public static final UserDTO EMPTY = new UserDTO((long)UserType.EMPTY.getValue(),UserType.EMPTY);

    private final Long  id;
    private UserState   state;
    private UserType    type;
    private String      name;
    private String      email;
    private String      phone;
    private String      password;
    private String      about;
    private Boolean     isNotified;
    private LocalDateTime muteStart;
    private LocalDateTime muteEnd;

    private UserDTO() {
        this.id         = (long) UserType.UNKNOWN.getValue();
        this.state      = UserState.UNKNOWN;
        this.type       = UserType.UNKNOWN;
        this.name       = "";
        this.email      = "";
        this.phone      = "";
        this.password   = "";
        this.about      = "";
        this.isNotified = false;
        this.muteStart  = LocalDateTime.MIN;
        this.muteEnd    = LocalDateTime.MAX;
    }

    private UserDTO(Long id, UserType type) {
        super();
        this.type = type;
        this.id = id;
    }

    public UserDTO(Long id, UserType type, UserState state, String name,
                   String email, String phone, String about, String password,
                   boolean isNotified, LocalDateTime muteStart, LocalDateTime muteEnd) {
        this.id         = id;
        this.state      = state;
        this.type       = type;
        this.name       = name;
        this.email      = Converter.maskEmail(email);
        this.phone      = Converter.maskStr(phone);
        this.password   = password;
        this.about      = about;
        this.isNotified = isNotified;
        this.muteStart  = muteStart;
        this.muteEnd    = muteEnd;
    }

    //<editor-fold desc="GetterAndSetter">

    public Long getId() {
        return id;
    }

    public UserState getState() {
        return state;
    }

    public UserType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getAbout() {
        return about;
    }

    public Boolean getNotified() {
        return isNotified;
    }

    public LocalDateTime getMuteStart() {
        return muteStart;
    }

    public LocalDateTime getMuteEnd() {
        return muteEnd;
    }
    //</editor-fold>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDTO that = (UserDTO) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
