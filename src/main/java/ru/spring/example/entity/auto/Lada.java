package ru.spring.example.entity.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Qualifier сильнее Primary
@Component
@Qualifier("Lada")
@Primary
public class Lada implements Auto{
    private String model = "Calina V8";
    private int price = 5430000;
    private Lada(){};

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

    @Override
    public String toString() {
        return "Lada{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
