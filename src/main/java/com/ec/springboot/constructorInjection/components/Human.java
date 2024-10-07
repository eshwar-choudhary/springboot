package com.ec.springboot.constructorInjection.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private Air air;
    private Food food;
    private Water water;

    @Autowired
    public Human(Air air, Food food, Water water) {
        this.air = air;
        this.food = food;
        this.water = water;
    }

    public Human(Air air, Food food) {
        this.air = air;
        this.food = food;
    }

    public boolean alive() {
        return this.air != null && this.food != null && this.water != null;
    }

    public boolean aliveWithoutWater() {
        return this.air != null && this.food != null;
    }

}

