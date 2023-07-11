package ru.spring.example.entity.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mazda")
public class Mazda implements Auto{

    private String model = "RX7";
    private int price = 2740000;
    public Mazda(){}

    @Override
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void initMethod(){
        setModel("RX7");
        setPrice(2740000);
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
