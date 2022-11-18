package com.example.demo.dao;

import com.example.demo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Car, Integer> {

//     List<Car> findAll();
    // Car findById(int id);
//     Car save(Car car);
//    Car update(int id, Car car);
//
//    Car delete(int id);
//

}
