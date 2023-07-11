package ru.spring.example.entity.animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Доступа к init, destroy методам нет.
@Component
@Qualifier
@Scope("prototype")
public class Dog implements Pet{
    private String name = "Poro";
    private int age = 2314;
    private final String speak = "HOWL!";

    public Dog(){}

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speak='" + speak + '\'' +
                '}';
    }
}
