package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "animal")
    public Animal getAnimalCat() {
        Animal animal = new Cat();
        return animal;
    }

    @Bean(name = "animalDog")
    @Qualifier("animalsCage")
    public Animal getAnimalDog() {
        Animal animal = new Dog();
        return animal;
    }

    @Bean("timer")
    public Timer getTimer() {
        return new Timer();
    }

}
