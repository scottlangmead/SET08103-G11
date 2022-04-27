package com.napier.sem;

/**
 * Attributes of a Language.
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class Language
{
    /**
     * Default constructor
     */
    public Language() {}

    /**
     * Language Name
     */
    private String language;
    /**
     *  Population of people who speak the Language
     */
    private long population;
    /**
     * Percentage of Worldwide speakers
     */
    private float globalPercentage;

    /**
     * Updates the Language Title
     * @param language
     */
    public void setLanguage(String language) { this.language = language; }
    /**
     * Retrieves the Language Title
     * @return Language Title
     */
    public String getLanguage() { return language; }

    /**
     * Updates the Population of people who speak the Language
     * @param population
     */
    public void setPopulation(long population) { this.population = population; }
    /**
     * Retrieves the Population of people who speak the Language
     * @return Population of people who speak the Language
     */
    public long getPopulation() { return population; }

    /**
     * Updates the Percentage of Worldwide speakers
     * @param percentage
     */
    public void setPercentage(float percentage) { this.globalPercentage = percentage; }
    /**
     * Retrieves the Percentage of Worldwide speakers
     * @return Percentage of Worldwide speakers
     */
    public float getPercentage() { return globalPercentage; }
}