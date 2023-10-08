package com.td.agromaps.dto;

import com.td.agromaps.models.Field;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class UserDTO {
    @NotNull(message = "Not null")
    @NotEmpty(message = "Not empty")
    @Email(message = "Email should be valid")
    @Size(max = 100, min = 5)
    private String email;

    @NotNull
    @NotEmpty
    @Size(max = 100, min = 3)
    private String username;

    @NotNull(message = "Not null")
    @NotEmpty(message = "Not empty")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
