package com.example.data;

/**
 * Created by TWPRUANHONG on 2017/3/9.
 */

public class Car implements Chargable{
    private CarProducer producer;
    private String name;
    private int ps;
    private double price;
    public Car(CarProducer producer,String name, int ps, double price) {
        this.producer = producer;
        this.name = name;
        this.ps = ps;
        this.price = price;
    }
    public CarProducer getProducer() {
        return producer;
    }
    public String getName() {
        return name;
    }
    public int getPs() {
        return ps;
    }
    public int getKw() {
        return (int) (ps/1.36);
    }
    @Override
    public double getPrice() {
        return price;
    }
}
