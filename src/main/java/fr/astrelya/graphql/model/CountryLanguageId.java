package fr.astrelya.graphql.model;

import java.io.Serializable;

public class CountryLanguageId implements Serializable {
    private Country country;
    private String language;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
