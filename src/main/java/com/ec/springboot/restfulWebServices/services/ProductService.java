package com.ec.springboot.restfulWebServices.services;

import com.ec.springboot.restfulWebServices.pojos.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private static List<Product> productList = new ArrayList<>();
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {

        Product honey = new Product();
        honey.setId(1);
        honey.setName("Honey");
        honey.setPrice("10");
        productList.add(honey);
        productMap.put(honey.getId(), honey);


        Product almond = new Product();
        almond.setId(2);
        almond.setName("Almond");
        almond.setPrice("20");
        productList.add(almond);
        productMap.put(almond.getId(), almond);

    }

    public List<Product> getProducts() {
        return productList;
    }

    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

}
