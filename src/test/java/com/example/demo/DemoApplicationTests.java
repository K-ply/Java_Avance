package com.example.demo;

import com.example.demo.controller.CarController;
import com.example.demo.controller.PingController;
import com.example.demo.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws Exception {
        assertThat(carController).isNotNull();
    }

    @Autowired
    private CarController carController;
    @Test
    public void getAll()throws Exception{
        List<Car> recupValue = carController.listeCars();
        List<Car>  attenduValue = new ArrayList<>();
        attenduValue.add(new Car(8, "clio", "Renault", "bleu"));
        attenduValue.add(new Car(2, "megane", "Renault", "rouge"));
        attenduValue.add(new Car(3, "zoé", "Renault", "blanc"));
        attenduValue.add(new Car(4, "trafic", "Renault", "noir"));
        attenduValue.add(new Car(5, "master", "Renault", "jaune"));
        assertEquals(recupValue.size(), attenduValue.size());

        for(int i=0; attenduValue.size()>i; i++){
            assertEquals(String.valueOf(recupValue.get(i)),(String.valueOf(attenduValue.get(i))));
        }
    }
    @Test
    public void findById() throws Exception{
        Car recupValue = carController.showCar(8);
        Car attenduValue = new Car(8, "clio", "Renault", "bleu");
        assertEquals(String.valueOf(recupValue), String.valueOf(attenduValue));

    }




}
