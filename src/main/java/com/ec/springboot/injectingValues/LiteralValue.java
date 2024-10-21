package com.ec.springboot.injectingValues;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class LiteralValue {

    @Value("Greetings for the day")
    private String greet;

}
