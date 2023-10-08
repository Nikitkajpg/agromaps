package com.td.agromaps.repositories;

import com.td.agromaps.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
