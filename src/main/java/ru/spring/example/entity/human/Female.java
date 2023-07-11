package ru.spring.example.entity.human;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("female")
public class Female implements Human{
    private String name = "Natasha";
    private int age = 23;
    private Female(){}
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

    private void initMethod(){
        setName("Natasha");
        setAge(25);
    }
    public static Female getFemale(){
        return new Female();
    }

    @Override
    public String toString() {
        return "Female{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
