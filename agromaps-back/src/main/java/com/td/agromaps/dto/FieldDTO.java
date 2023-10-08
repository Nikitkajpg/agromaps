package com.td.agromaps.dto;

import com.td.agromaps.models.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class FieldDTO {
    @NotNull
    @NotEmpty
    @Size(max = 100, min = 1)
    private String name;

    @NotNull
    @NotEmpty
    @Size(max = 300, min = 1)
    private String address;

    @Size(max = 30)
    private String parameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
