package dev.hylansilva.meetinghub_api.models.entities.enums;

public enum UserRole {

    PRESIDENT("president"),
    DIRECTOR("director"),
    MANAGER("manager"),
    COORDINATOR("coordinator"),
    ANALYST("analyst"),
    ENGINEER("engineer"),
    TECHNICIAN("technician"),
    ASSISTANT("assistant"),
    OPERATOR("operator"),
    INTERN("intern"),
    CONTRACTOR("contractor"),
    ADMIN("admin");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return "ROLE_" + role.toUpperCase();
    }
}
