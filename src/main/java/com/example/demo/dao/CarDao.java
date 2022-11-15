package com.example.demo.dao;

import com.example.demo.model.Car;

import java.util.List;


public interface CarDao {

    List<Car> findAll();
    Car findById(int id);
    Car save(Car car);
    Car update(int id, Car car);

    Car delete(int id, Car car);


}
