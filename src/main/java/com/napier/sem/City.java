package com.napier.sem;

/**
 * Attributes of a City
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class City {
    /**
     * City ID
     */
    private int id;
    /**
     * City Name
     */
    private String name;
    /**
     * City Country Code
     */
    private String countryCode;
    /**
     * City District
     */
    private String district;
    /**
     * City Population
     */
    private int population;

    /**
     * Changes the city ID
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Gets the city ID
     * @return city id
     */
    public int getId() {
        return id;
    }

    /**
     * Changes the city name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Changes the name of the country
     * @return city name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes the country code
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Gets the country code of the city
     * @return Country code for city
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Changes the district of the city
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * Gets the district of the city
     * @return district for city
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Changes the population of the city
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }
    /**
     * Gets the population of the city
     * @return population for the city
     */
    public int getPopulation() {
        return population;
    }
}