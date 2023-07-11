package ru.spring.example.entity.human;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Male implements Human {
    private String name = "Boris";
    private int age = 45;
    private Male(){}
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
        setName("Boris");
        setAge(35);
    }
    public static Male getMale(){
        return new Male();
    }

    @Override
    public String toString() {
        return "Male{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
