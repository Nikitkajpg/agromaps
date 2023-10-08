package com.td.agromaps.controllers;

import com.td.agromaps.dto.MeasurementDTO;
import com.td.agromaps.dto.MeasurementResponse;
import com.td.agromaps.models.Measurement;
import com.td.agromaps.services.MeasurementService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/measurements")
@CrossOrigin("http://localhost:8081/")
public class MeasurementController {
    private MeasurementService measurementService;
    private ModelMapper modelMapper;

    @Autowired
    public MeasurementController(MeasurementService measurementService, ModelMapper modelMapper) {
        this.measurementService = measurementService;
        this.modelMapper = modelMapper;
    }

    private Measurement convertToMeasurement(MeasurementDTO measurementDTO) {
        return modelMapper.map(measurementDTO, Measurement.class);
    }

    private MeasurementDTO convertToMeasurementDTO(Measurement measurement) {
        return modelMapper.map(measurement, MeasurementDTO.class);
    }

    @GetMapping
    public MeasurementResponse showMeasurements() {
        return new MeasurementResponse(measurementService.findAll().stream()
                .map(this::convertToMeasurementDTO).collect(Collectors.toList()));
    }
}
