package fr.astrelya.graphql.dao;

import fr.astrelya.graphql.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityDao extends CrudRepository<City, Integer> {
}
