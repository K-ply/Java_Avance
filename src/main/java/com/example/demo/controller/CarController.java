package com.example.demo.controller;

import com.example.demo.dao.CarDao;
import com.example.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public void saveCar(@Valid @RequestBody Car newCar){
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
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
