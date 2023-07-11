package ru.spring.example.service.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import ru.spring.example.entity.human.Human;
import org.springframework.stereotype.Component;


@Component
public class HumanService {
    private Human human;

    @Value("${humanService.available}")
    private boolean available;
    @Value("${humanService.alive}")
    private boolean alive;

    public Human getHuman() { return human; }

    @Autowired
    @Qualifier("female")
    public void setHuman(Human human) {
        this.human = human;
    }




    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
