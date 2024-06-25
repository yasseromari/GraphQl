package fr.astrelya.graphql.model;
import javax.persistence.*;

@Entity
@Table(name = "CITY")
public class City {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    private String district;
    private int population;

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
