package com.ec.springboot.injectingValues.customFiles;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@Configuration
@PropertySource("classpath:database.properties")
@ConfigurationProperties(prefix = "database")
public class CustomProperties {

    private String host;
    private int port;
    private String schema;
    private String username;
    private String password;

}

