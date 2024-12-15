package dev.hylansilva.meetinghub_api.models.entities.enums;

public enum UserRole {

    CUSTOMER("customer"),
    CRAFTSMAN("craftsman"),
    COMPANY("company"),
    USER("user"),
    ADMIN("admin");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return "ROLE_" + role.toUpperCase();
    }
}
