package fr.astrelya.graphql.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COUNTRYLANGUAGE")
@IdClass(CountryLanguageId.class)
public class CountryLanguage implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Id
    private String language;

    @Enumerated(EnumType.STRING)
    private IsOfficial isOfficial;

    private double percentage;

    // Getter and Setter methods

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

    public IsOfficial getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(IsOfficial isOfficial) {
        this.isOfficial = isOfficial;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public enum IsOfficial {
        T,
        F
    }

}


