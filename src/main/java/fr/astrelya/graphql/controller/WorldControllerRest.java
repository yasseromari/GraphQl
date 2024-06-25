package fr.astrelya.graphql.controller;

import fr.astrelya.graphql.model.Country;
import fr.astrelya.graphql.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldControllerRest {
    @Autowired
    WorldService worldService;


    @GetMapping("/countries")
    //@QueryMapping
    public Iterable<Country> getAllCountries(){
        return worldService.getAllCountries();
    }
}
