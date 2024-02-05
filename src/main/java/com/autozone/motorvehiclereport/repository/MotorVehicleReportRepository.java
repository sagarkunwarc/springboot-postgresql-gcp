package com.autozone.motorvehiclereport.repository;

import com.autozone.motorvehiclereport.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MotorVehicleReportRepository extends CrudRepository<Vehicle,Long> {
}
