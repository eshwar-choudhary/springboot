package com.ec.springboot.injectingValues;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
public class ListsAndArrays {

    @Value("#{'${fruits}'.split(',')}")
    private List<String> fruits;

    @Value("#{'${vegetables:v1,v2,v3}'.split(',')}")
    private List<String> vegetables;

    @Value("${bikes:b1,b2,b3}")
    private String bikes[];

}
