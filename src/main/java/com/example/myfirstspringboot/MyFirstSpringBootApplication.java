package com.example.myfirstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringBootApplication.class, args);
    }

}

class Coffee {
    private final String id = null;
    private String name;

    public Coffee(String name) {
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
