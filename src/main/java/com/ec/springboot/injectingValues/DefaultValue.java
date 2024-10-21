package com.ec.springboot.injectingValues;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DefaultValue {

    @Value("${myapp.greeting:Greetings for the day}")
    private String greeting;

}
