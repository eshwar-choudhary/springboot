package com.ec.springboot.constructorInjection;

import com.ec.springboot.constructorInjection.components.Air;
import com.ec.springboot.constructorInjection.components.Food;
import com.ec.springboot.constructorInjection.components.Human;
import com.ec.springboot.constructorInjection.components.Water;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //WAY-1
    @Bean
    @Qualifier("aliveHuman")
    public Human createFullHuman(Air air, Food food, Water water) {
        return new Human(air, food, water);
    }

    @Bean
    @Qualifier("aliveWithoutWaterHuman")
    public Human createMinimalHuman(Air air, Food food) {
        return new Human(air, food);
    }

    /*
    //WAY-2
    @Bean(name = "aliveHuman")
    public Human createFullHuman(Air air, Food food, Water water) {
        return new Human(air, food, water);
    }

    @Bean(name = "aliveWithoutWaterHuman")
    public Human createMinimalHuman(Air air, Food food) {
        return new Human(air, food);
    }
    */
}
