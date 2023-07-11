package ru.spring.example.entity.animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Qualifier
@Scope("singleton")
public class Cat implements Pet{
    private String name = "Aurelian";
    private int age = 1899;
    private final String speak = "MEOW!";

    public Cat(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void petSpeak() {
        System.out.println(speak);
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("doMyInit activated!");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doMyDestroy activated!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speak='" + speak + '\'' +
                '}';
    }
}
