package fr.astrelya.graphql.dao;

import fr.astrelya.graphql.model.CountryLanguage;
import fr.astrelya.graphql.model.CountryLanguageId;
import org.springframework.data.repository.CrudRepository;

public interface CountryLanguageDao extends CrudRepository<CountryLanguage, CountryLanguageId> {
}
