package com.td.agromaps.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Not null")
    @NotEmpty(message = "Not empty")
    @Email(message = "Email should be valid")
    @Size(max = 100, min = 5)
    @Column
    private String email;

    @NotNull
    @NotEmpty
    @Size(max = 100, min = 3)
    @Column
    private String username;

    @NotNull(message = "Not null")
    @NotEmpty(message = "Not empty")
    @Column
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Field> fields;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
