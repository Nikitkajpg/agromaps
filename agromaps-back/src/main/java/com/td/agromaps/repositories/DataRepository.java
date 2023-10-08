package com.td.agromaps.repositories;

import com.td.agromaps.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Integer> {
}
