package com.td.agromaps.controllers;

import com.td.agromaps.dto.FieldDTO;
import com.td.agromaps.dto.FieldResponse;
import com.td.agromaps.models.Field;
import com.td.agromaps.services.FieldService;
import com.td.agromaps.util.FieldValidator;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/fields")
@CrossOrigin("http://localhost:8081/")
public class FieldController {
    private FieldService fieldService;
    private ModelMapper modelMapper;
    private FieldValidator fieldValidator;

    @Autowired
    public FieldController(FieldService fieldService, ModelMapper modelMapper, FieldValidator fieldValidator) {
        this.fieldService = fieldService;
        this.modelMapper = modelMapper;
        this.fieldValidator = fieldValidator;
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> addField(@RequestBody @Valid FieldDTO fieldDTO, BindingResult bindingResult) {
        Field field = convertToField(fieldDTO);

        fieldValidator.validate(field, bindingResult);
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
        }

        fieldService.addField(field);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    private Field convertToField(FieldDTO fieldDTO) {
        return modelMapper.map(fieldDTO, Field.class);
    }

    private FieldDTO convertToFieldDTO(Field field) {
        return modelMapper.map(field, FieldDTO.class);
    }

    @GetMapping
    public FieldResponse showFields() {
        return new FieldResponse(fieldService.findAll().stream()
                .map(this::convertToFieldDTO).collect(Collectors.toList()));
    }
}
