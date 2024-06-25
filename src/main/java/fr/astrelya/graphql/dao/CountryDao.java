package fr.astrelya.graphql.dao;

import fr.astrelya.graphql.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryDao extends CrudRepository<Country,String> {
}
