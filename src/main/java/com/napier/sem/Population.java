package com.napier.sem;

/**
 * Attributes of a Populations.
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class Population
{
    /**
     * Default constructor
     */
    public Population() {}

    /**
     * Population's name
     */
    private String name;
    /**
     * People living in countries
     */
    private long populationCountry;
    /**
     *  People living in cities
     */
    private long populationCity;

    /**
     * Updates the Population Name
     * @param name
     */
    public void setName(String name) { this.name = name; }
    /**
     * Retrieves the Population Name
     * @return Population Name
     */
    public String getName() { return name; }

    /**
     * Updates the Population of people living in Countries
     * @param populationCountry
     */
    public void setCountryPopulation(long populationCountry) { this.populationCountry = populationCountry; }
    /**
     * Retrieves the Population of people living in Countries
     * @return Population of people living in Countries
     */
    public long getCountryPopulation() { return populationCountry; }

    /**
     * Updates the Population of people living in Cities
     * @param populationCity
     */
    public void setCityPopulation(long populationCity) { this.populationCity = populationCity; }
    /**
     * Retrieves the Population of people living in Cities
     * @return Population of people living in Cities
     */
    public long getCityPopulation() { return populationCity; }
}