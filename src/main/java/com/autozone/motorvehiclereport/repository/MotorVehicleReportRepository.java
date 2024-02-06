package com.autozone.motorvehiclereport.repository;

import com.autozone.motorvehiclereport.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorVehicleReportRepository extends JpaRepository<Vehicle,Long> {
}
