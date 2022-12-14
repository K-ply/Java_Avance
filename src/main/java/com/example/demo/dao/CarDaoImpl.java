//package com.example.demo.dao;
//
//import com.example.demo.model.Car;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class CarDaoImpl implements CarDao {
//    public List<Car> cars = new ArrayList<>();
//    public CarDaoImpl() {
//        cars.add(new Car(8, "clio", "Renault", "bleu"));
//        cars.add(new Car(2, "megane", "Renault", "rouge"));
//        cars.add(new Car(3, "zoé", "Renault", "blanc"));
//        cars.add(new Car(4, "trafic", "Renault", "noir"));
//        cars.add(new Car(5, "master", "Renault", "jaune"));
//    }
//
//    @Override
//    public List<Car> findAll() {
//        return cars;
//    }
//
//    @Override
//    public Car findById(int id) {
//        for (Car car : cars) {
//            if (car.getId() == id) {
//                return car;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Car save(Car car) {
//        cars.add(car);
//        return null;
//    }
//
//    @Override
//    public Car update(int id, Car car) {
//        Car updateCar = findById(id);
//        cars.set(cars.indexOf(updateCar), car);
//        return car;
//    }
//
//    @Override
//    public Car delete(int id){
//        Car carDelete = findById(id);
//        cars.remove(carDelete);
//        return carDelete;
//    }
//
//
//}
