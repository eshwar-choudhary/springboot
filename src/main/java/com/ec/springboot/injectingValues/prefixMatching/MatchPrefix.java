package com.ec.springboot.injectingValues.prefixMatching;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "server")
public class MatchPrefix {

    private String port;
    private String port1 = "8080";

    //The line private String port = "8080"; sets a default value of "8080" for the port property. If the server.port property is not defined in your application.properties, the value of port will remain "8080".

}

