package com.example.demo.model;

public class Car {
   public int id;
    public String model;
    public String brand;

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;


    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Car(int id, String model, String brand, String color ){
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }


    @Override
    public String toString() {
        return "CarList{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
