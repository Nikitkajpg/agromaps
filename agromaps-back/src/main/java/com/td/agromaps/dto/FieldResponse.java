package com.td.agromaps.dto;

import java.util.List;

public class FieldResponse {
    private List<FieldDTO> fields;

    public FieldResponse(List<FieldDTO> fields) {
        this.fields = fields;
    }

    public List<FieldDTO> getFields() {
        return fields;
    }

    public void setFields(List<FieldDTO> fields) {
        this.fields = fields;
    }
}
