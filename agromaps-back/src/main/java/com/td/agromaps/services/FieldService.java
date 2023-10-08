package com.td.agromaps.services;

import com.td.agromaps.models.Field;
import com.td.agromaps.repositories.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FieldService {
    private final FieldRepository fieldRepository;

    @Autowired
    public FieldService(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public List<Field> findAll() {
        return fieldRepository.findAll();
    }

    @Transactional
    public void addField(Field field) {
        fieldRepository.save(field);
    }
}
