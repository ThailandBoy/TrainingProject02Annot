package ru.spring.example;

import ru.spring.example.entity.animal.Cat;
import ru.spring.example.entity.animal.Dog;
import ru.spring.example.entity.animal.Pet;
import ru.spring.example.entity.auto.Auto;
import ru.spring.example.entity.auto.Lada;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.example.entity.human.Human;
import ru.spring.example.service.PetService;
import ru.spring.example.service.auto.CarService;
import ru.spring.example.service.human.HumanService;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Pet cat1 = context.getBean("cat", Cat.class);
        cat1.petSpeak();
//        CarService carService = context.getBean("carService", CarService.class);
//        System.out.println(carService.getAuto());

        context.close();

    }
}
