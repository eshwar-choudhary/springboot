package com.ec.springboot.constructorInjection.services;

import com.ec.springboot.constructorInjection.components.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HumanService {

    //WAY-1
    @Autowired
    @Qualifier("aliveHuman")
    private Human fullHuman;

    @Autowired
    @Qualifier("aliveWithoutWaterHuman")
    private Human minimalHuman;

    /*
    //WAY-2
    private final Human fullHuman;
    private final Human minimalHuman;

    @Autowired
    public HumanService(@Qualifier("aliveHuman") Human fullHuman,
                        @Qualifier("aliveWithoutWaterHuman") Human minimalHuman) {
        this.fullHuman = fullHuman;
        this.minimalHuman = minimalHuman;
    }
    */


    public void printHumanStatus() {
        System.out.println("Full Human is alive: " + fullHuman.alive());
        System.out.println("Minimal Human is alive: " + minimalHuman.aliveWithoutWater());
    }

}

