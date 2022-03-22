package com.napier.sem;

public class Language
{
    /**
     * Language's Country Code
     */
    private String code;
    /**
     * Language Name
     */
    private String language;
    /**
     *  Language Status
     */
    private Boolean isOfficial;
    /**
     * Percentage of Speakers in Country
     */
    private int percentage;

    /**
     * Updates the Language Code
     * @param code
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Retrieves the Language Code
     * @return Language Code
     */
    public String getCode() { return code; }

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
     * Updates the Language Status
     * @param official
     */
    public void setOfficial(Boolean official) { isOfficial = official; }
    /**
     * Retrieves the Language Status
     * @return Language Status
     */
    public Boolean getOfficial() { return isOfficial; }

    /**
     * Updates the Language Percentage
     * @param percentage
     */
    public void setPercentage(int percentage) { this.percentage = percentage; }
    /**
     * Retrieves the Language Percentage
     * @return Language Percentage
     */
    public int getPercentage() { return percentage; }
}