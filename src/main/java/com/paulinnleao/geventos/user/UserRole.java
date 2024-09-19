package com.paulinnleao.geventos.user;

public enum UserRole {

    ADMIN("ADMIN"),
    PARTICIPANT("PARTICIPANT");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
