package com.napier.sem;

/**
 * Attributes of a Country.
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class Country
{
    /**
     * Default constructor
     */
    public Country() {}

    /**
     * Country's Code
     */
    private String code;
    /**
     * Country's Name
     */
    private String name;
    /**
     * Country's Continent
     */
    private String continent;
    /**
     * Country's Region
     */
    private String region;
    /**
     * Country Population
     */
    private int population;
    /**
     * Country's Capital
     */
    private String capital;

    /**
     * Updates the Country Code
     * @param code
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Retrieves the Country Code
     * @return Country Code
     */
    public String getCode() { return code; }

    /**
     * Updates the Country Name
     * @param name
     */
    public void setName(String name) { this.name = name; }
    /**
     * Retrieves the Country Name
     * @return Country Name
     */
    public String getName() { return name; }

    /**
     * Updates the Country Continent
     * @param continent
     */
    public void setContinent(String continent) { this.continent = continent; }
    /**
     * Retrieves the Country Continent
     * @return Country Continent
     */
    public String getContinent() { return continent; }

    /**
     * Updates the Country Region
     * @param region
     */
    public void setRegion(String region) { this.region = region; }
    /**
     * Retrieves the Country Region
     * @return Country Region
     */
    public String getRegion() { return region; }

    /**
     * Updates the Country Population
     * @param population
     */
    public void setPopulation(int population) { this.population = population; }
    /**
     * Retrieves the Country Population
     * @return Country Population
     */
    public int getPopulation() { return population; }

    /**
     * Updates the Country Capital
     * @param capital
     */
    public void setCapital(String capital) { this.capital = capital; }
    /**
     * Retrieves the Country Capital
     * @return Country Capital
     */
    public String getCapital() { return capital; }
}