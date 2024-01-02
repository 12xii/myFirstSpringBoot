package com.example.myfirstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class RestApiController {
    private List<Coffee> coffees = new ArrayList<>();

    public RestApiController(){
        coffees.addAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee(("Cafe Ganador")),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Tres Pontas")
        ));
    }

    @GetMapping("coffees")
    Iterable<Coffee> getCoffees() {
        return coffees;
    }
}
