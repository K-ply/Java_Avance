package com.example.demo.controller;

import com.example.demo.dao.CarDao;
import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao){
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public List<Car> listeCars() {
        return this.carDao.findAll();
    }

    @GetMapping(value = "/car/{id}")
    public Car showCar(@PathVariable int id) {
        return this.carDao.findById(id);
    }

    @PostMapping("/save")
    public void saveCar(@RequestBody Car newCar){
        this.carDao.save(newCar);
    }

    @PutMapping("/car/{id}")
    public void update(@RequestBody Car updateCar, @PathVariable int id){
      this.carDao.update(id, updateCar);
    }





}
