package com.autozone.motorvehiclereport.controller;

import com.autozone.motorvehiclereport.model.Vehicle;
import com.autozone.motorvehiclereport.service.MotorVehicleReportService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/mvr/v1")
public class MotorVehicleReportController {


    private final MotorVehicleReportService reportService;

    public MotorVehicleReportController(MotorVehicleReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public String index(){
        return "Hello World !!";
    }


    @GetMapping("/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable(value = "id") Long id)  {
        return  reportService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicle create(@RequestBody Vehicle vehicle) {
        return reportService.save(vehicle);
    }

    @GetMapping("/allVehicles")
    public Iterable<Vehicle> findAllVehicles(){
        return reportService.findAll();
    }

    @DeleteMapping("/{id}")
    public Vehicle removeVehicle(@PathVariable Long id){
        return reportService.deleteVehicleById(id);
    }
}
