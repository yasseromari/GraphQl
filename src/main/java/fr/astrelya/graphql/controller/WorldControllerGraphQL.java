package fr.astrelya.graphql.controller;

import fr.astrelya.graphql.model.City;
import fr.astrelya.graphql.model.Country;
import fr.astrelya.graphql.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WorldControllerGraphQL {
    @Autowired
    WorldService worldService;


    @QueryMapping
    public Iterable<Country> Countries(){
        return  worldService.getAllCountries();
    }

    @QueryMapping
    public Iterable<City> allCities(){
        return worldService.getAllCities();
    }

    @QueryMapping
    public City findCity(@Argument int id){
        return worldService.findCityById(id);
    }
}
