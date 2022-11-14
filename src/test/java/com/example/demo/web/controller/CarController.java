package com.example.demo.web.controller;

import com.example.demo.dao.CarDao;
import com.example.demo.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public Car afficherUnCar(@PathVariable int id) {
        return this.carDao.findById(id);
    }

    @GetMapping("/car/save")
    public void supprimerUnCar(){
        Car car = new Car(25, "bibi","bobo", "bubu");
        this.carDao.save(car);
    }

}
