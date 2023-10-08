package com.td.agromaps.controllers;

import com.td.agromaps.dto.DataDTO;
import com.td.agromaps.dto.DataResponse;
import com.td.agromaps.dto.FieldDTO;
import com.td.agromaps.dto.FieldResponse;
import com.td.agromaps.models.Data;
import com.td.agromaps.models.Field;
import com.td.agromaps.services.DataService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/data")
@CrossOrigin("http://localhost:8081/")
public class DataController {
    private DataService dataService;
    private ModelMapper modelMapper;

    @Autowired
    public DataController(DataService dataService, ModelMapper modelMapper) {
        this.dataService = dataService;
        this.modelMapper = modelMapper;
    }

    private Data convertToData(DataDTO dataDTO) {
        return modelMapper.map(dataDTO, Data.class);
    }

    private DataDTO convertToDataDTO(Data data) {
        return modelMapper.map(data, DataDTO.class);
    }

    @GetMapping
    public DataResponse showData() {
        return new DataResponse(dataService.findAll().stream()
                .map(this::convertToDataDTO).collect(Collectors.toList()));
    }
}
