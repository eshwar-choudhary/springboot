package com.ec.springboot.injectingValues;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PropertiesFile {

    @Value("${spring.application.name}")
    private String applicationName;

}
