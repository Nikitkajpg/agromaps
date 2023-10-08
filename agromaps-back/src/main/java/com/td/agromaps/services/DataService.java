package com.td.agromaps.services;

import com.td.agromaps.models.Data;
import com.td.agromaps.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DataService {
    private final DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<Data> findAll() {
        return dataRepository.findAll();
    }


}
