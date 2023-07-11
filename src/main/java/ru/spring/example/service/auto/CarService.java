package ru.spring.example.service.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import ru.spring.example.entity.auto.Auto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("carService")
@Scope("prototype")
public class CarService {

    // Здесь введена зависимость к реализующим интерфейс авто
    // Аннотация Qualifier у зависимости означает - ожидать бин с Qualifier' ом "Mazda"
    // В противном случае будет выброшенна ошибка неоднозначности
    // Qualifier сильнее Primary
    @Autowired
    @Qualifier("Mazda")
    private Auto auto;

    @Value("${carService.available}")
    private boolean available;

    @Value("${carService.count}")
    private int count;

    public CarService(){};

    @PostConstruct
    public void doMyInit(){
        System.out.println("doMyInit activated!");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doMyDestroy activated!");
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "auto=" + auto +
                ", available=" + available +
                ", count=" + count +
                '}';
    }
}
