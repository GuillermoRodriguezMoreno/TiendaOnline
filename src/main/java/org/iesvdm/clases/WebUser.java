package org.iesvdm.clases;

public class WebUser {

    // Enum
    public enum UserState {NEW, ACTIVE, BLOCKED, BANNED};

    // Atributos

    private String loginId;
    private String password;
    private  UserState state;

    // Constructores

   public WebUser(String loginId, String password, UserState state) {

        this.loginId = loginId;
        this.password = password;
        this.state = state;

    }

    // Getters y Setters

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }
}
