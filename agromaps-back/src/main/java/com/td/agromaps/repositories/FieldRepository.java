package com.td.agromaps.repositories;

import com.td.agromaps.models.Field;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<Field, Integer> {
}
