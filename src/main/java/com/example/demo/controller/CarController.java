package com.example.demo.controller;

import com.example.demo.dao.CarDao;
import com.example.demo.model.Car;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private CarDao carDao;

    public CarController(CarDao carDao){
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public MappingJacksonValue listeCars() {

        List<Car> cars = carDao.findAll();
        return new MappingJacksonValue(cars);
    }

    @GetMapping(value = "/car/{id}")
    public Optional<Car> showCar(@PathVariable int id) {
        return carDao.findById(id);
    }

    @PostMapping("/save")
    public void saveCar(@RequestBody Car newCar){
        this.carDao.save(newCar);
    }

    @PutMapping("/car/{id}")
    public void update(@RequestBody Car car){
      this.carDao.save(car);
    }

    @DeleteMapping("/car/{id}")
    public void delete(@PathVariable int id){
        this.carDao.deleteById(id);
    }

}
