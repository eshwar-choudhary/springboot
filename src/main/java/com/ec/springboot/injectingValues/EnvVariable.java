package com.ec.springboot.injectingValues;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class EnvVariable {

    //HOSTNAME=eshwar.customerxps.com java -jar build/libs/springboot-0.0.1-SNAPSHOT.jar
    @Value("${HOSTNAME:localhost}")
    private String hostName;

}

