package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Contains unit tests, excluding database interaction related functions.
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class UnitTest
{
    static Queries queries;

    @BeforeAll
    static void init() { queries = new Queries(); }

    // TESTING PRINT COUNTRIES FUNCTIONS

    @Test
    void printCountriesTestNull() { queries.printCountries(null); }
    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<>();
        queries.printCountries(countries);
    }
    @Test
    void printCountriesTestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        queries.printCountries(countries);
    }
    @Test
    void printCountriesTestNonNull()
    {
        ArrayList<Country> countries = new ArrayList<>();
        Country c = new Country();
        c.setCode("FRA");
        c.setName("France");
        c.setContinent("Europe");
        c.setRegion("Western Europe");
        c.setPopulation(59225700);
        c.setCapital("Paris");
        countries.add(c);
        queries.printCountries(countries);
    }

    // TESTING PRINT CITIES FUNCTIONS

    @Test
    void printCitiesTestNull() { queries.printCities(null); }
    @Test
    void printCitiesTestEmpty()
    {
        ArrayList<City> cities = new ArrayList<>();
        queries.printCities(cities);
    }
    @Test
    void printCitiesTestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        queries.printCities(cities);
    }
    @Test
    void printCitiesTestNonNull()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c = new City();
        c.setId(2974);
        c.setName("Paris");
        c.setCountryCode("FRA");
        c.setDistrict("Île-de-France");
        c.setPopulation(2125246);
        cities.add(c);
        queries.printCities(cities);
    }

    // TESTING PRINT CAPITALS FUNCTIONS

    @Test
    void printCapitalsTestNull() { queries.printCapitals(null); }
    @Test
    void printCapitalsTestEmpty()
    {
        ArrayList<City> capitals = new ArrayList<>();
        queries.printCapitals(capitals);
    }
    @Test
    void printCapitalsTestContainsNull()
    {
        ArrayList<City> capitals = new ArrayList<>();
        capitals.add(null);
        queries.printCapitals(capitals);
    }
    @Test
    void printCapitalsTestNonNull()
    {
        ArrayList<City> capitals = new ArrayList<>();
        City c = new City();
        c.setName("Paris");
        c.setCountryCode("FRA");
        c.setPopulation(2125246);
        capitals.add(c);
        queries.printCapitals(capitals);
    }

    // TESTING COUNTRY QUERIES

    @Test
    void countryBaseQueryTestNull() { queries.countryBaseQuery(null, 0); }
    @Test
    void countryBaseQueryTestEmpty() { queries.countryBaseQuery("", 0); }

    // TESTING CITY QUERIES

    @Test
    void cityBaseQueryTestNull() { queries.cityBaseQuery(null, 0); }
    @Test
    void cityBaseQueryTestEmpty() { queries.cityBaseQuery("", 0); }

    // TESTING CAPITAL QUERIES

    @Test
    void capitalBaseQueryTestNull() { queries.capitalBaseQuery(null, 0); }
    @Test
    void capitalBaseQueryTestEmpty() { queries.capitalBaseQuery("", 0); }
}