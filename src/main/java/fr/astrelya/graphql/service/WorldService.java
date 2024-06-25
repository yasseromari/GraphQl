package fr.astrelya.graphql.service;

import fr.astrelya.graphql.dao.CityDao;
import fr.astrelya.graphql.dao.CountryDao;
import fr.astrelya.graphql.dao.CountryLanguageDao;
import fr.astrelya.graphql.model.City;
import fr.astrelya.graphql.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldService {
    @Autowired
    CountryDao countryDao;
    @Autowired
    CityDao cityDao;
    @Autowired
    CountryLanguageDao countryLanguageDao;


    public Iterable<Country> getAllCountries() {
        return countryDao.findAll();
    }

    public Iterable<City> getAllCities() {
        return cityDao.findAll();
    }

    public City findCityById(int id){
        return cityDao.findById(id).orElse(null);
    }
}
