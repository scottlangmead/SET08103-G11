package com.napier.sem;

/**
 * Attributes of a City
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class City
{
    /**
     * Default constructor
     */
    public City() {}

    /**
     * City's ID
     */
    private int id;
    /**
     * City's Name
     */
    private String name;
    /**
     * City's Country Code
     */
    private String countryCode;
    /**
     * City's District
     */
    private String district;
    /**
     * City's Population
     */
    private int population;

    /**
     * Updates the City ID
     * @param id
     */
    public void setId(int id) { this.id = id; }
    /**
     * Retrieves the City ID
     * @return City ID
     */
    public int getId() {
        return id;
    }

    /**
     * Updates the City Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Retrieves the City Name
     * @return City Name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the Country Code of the City
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Retrieves the Country Code of the City
     * @return Country Code of City
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Updates the City District
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * Retrieves the City District
     * @return City District
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Updates the City Population
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }
    /**
     * Retrieves the City Population
     * @return City Population
     */
    public int getPopulation() {
        return population;
    }
}