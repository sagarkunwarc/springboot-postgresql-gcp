package com.autozone.motorvehiclereport.service;

import com.autozone.motorvehiclereport.model.Vehicle;
import com.autozone.motorvehiclereport.repository.MotorVehicleReportRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotorVehicleReportService {


    private final MotorVehicleReportRepository reportRepository;

    public MotorVehicleReportService(MotorVehicleReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Optional<Vehicle> findById(Long id) {
        return reportRepository.findById(id);
    }

    public Vehicle save(Vehicle vehicle) {
        return reportRepository.save(vehicle);
    }

    public Iterable<Vehicle> findAll() {
        return reportRepository.findAll();
    }

    public Vehicle deleteVehicleById(Long id) {
        reportRepository.deleteById(id);
        return null;
    }
}
