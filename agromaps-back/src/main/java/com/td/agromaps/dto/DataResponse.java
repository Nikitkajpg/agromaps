package com.td.agromaps.dto;

import java.util.List;

public class DataResponse {
    private List<DataDTO> data;

    public DataResponse(List<DataDTO> data) {
        this.data = data;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }
}
