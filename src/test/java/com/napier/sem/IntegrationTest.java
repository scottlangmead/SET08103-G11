package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest
{
    static Queries queries;

    @BeforeAll
    static void init()
    {
        queries = new Queries();
        queries.connect("localhost:33060", 30000);
    }

    // COUNTRIES

    @Test
    void allCountriesGlobalTest()
    {
        ArrayList<Country> countries = queries.allCountriesGlobal();
        assertEquals(countries.size(), 239);
    }
    @Test
    void allCountriesContinentTest()
    {
        ArrayList<Country> countries = queries.allCountriesContinent("Europe");
        assertEquals(countries.size(), 46);
        assertEquals(countries.get(0).getContinent(), "Europe");
    }
    @Test
    void allCountriesRegionTest()
    {
        ArrayList<Country> countries = queries.allCountriesRegion("Middle East");
        assertEquals(countries.size(), 18);
        assertEquals(countries.get(0).getRegion(), "Middle East");
    }
    @Test
    void topCountriesGlobalTest()
    {
        ArrayList<Country> countries = queries.topCountriesGlobal(10);
        assertEquals(countries.size(), 10);
        assertEquals(countries.get(0).getName(), "China");
        assertEquals(countries.get(1).getName(), "India");
        assertEquals(countries.get(2).getName(), "United States");
    }
    @Test
    void topCountriesContinentTest()
    {
        ArrayList<Country> countries = queries.topCountriesContinent(10, "Asia");
        assertEquals(countries.size(), 10);
        assertEquals(countries.get(0).getName(), "China");
        assertEquals(countries.get(1).getName(), "India");
        assertEquals(countries.get(2).getName(), "Indonesia");
    }
    @Test
    void topCountriesRegionTest()
    {
        ArrayList<Country> countries = queries.topCountriesRegion(10, "Caribbean");
        assertEquals(countries.size(), 10);
        assertEquals(countries.get(0).getName(), "Cuba");
        assertEquals(countries.get(1).getName(), "Dominican Republic");
        assertEquals(countries.get(2).getName(), "Haiti");
    }

    // CITIES

    @Test
    void allCitiesGlobalTest()
    {
        ArrayList<City> cities = queries.allCitiesGlobal();
        assertEquals(cities.size(), 4079);
    }
    @Test
    void allCitiesContinentTest()
    {
        ArrayList<City> cities = queries.allCitiesContinent("Oceania");
        assertEquals(cities.size(), 55);
        assertEquals(cities.get(0).getName(), "Sydney");
        assertEquals(cities.get(1).getName(), "Melbourne");
        assertEquals(cities.get(2).getName(), "Brisbane");
    }
    @Test
    void allCitiesRegionTest()
    {
        ArrayList<City> cities = queries.allCitiesRegion("Central Africa");
        assertEquals(cities.size(), 38);
        assertEquals(cities.get(0).getName(), "Kinshasa");
        assertEquals(cities.get(1).getName(), "Luanda");
        assertEquals(cities.get(2).getName(), "Douala");
    }
    @Test
    void allCitiesCountryTest()
    {
        ArrayList<City> cities = queries.allCitiesCountry("United Kingdom");
        assertEquals(cities.size(), 81);
        assertEquals(cities.get(0).getName(), "London");
        assertEquals(cities.get(1).getName(), "Birmingham");
        assertEquals(cities.get(2).getName(), "Glasgow");
    }
    @Test
    void allCitiesDistrictTest()
    {
        ArrayList<City> cities = queries.allCitiesDistrict("Scotland");
        assertEquals(cities.size(), 4);
        assertEquals(cities.get(0).getName(), "Glasgow");
        assertEquals(cities.get(1).getName(), "Edinburgh");
        assertEquals(cities.get(2).getName(), "Aberdeen");
    }
    @Test
    void topCitiesGlobalTest()
    {
        ArrayList<City> cities = queries.topCitiesGlobal(5);
        assertEquals(cities.size(), 5);
        assertEquals(cities.get(0).getName(), "Mumbai (Bombay)");
        assertEquals(cities.get(1).getName(), "Seoul");
        assertEquals(cities.get(2).getName(), "São Paulo");
    }
    @Test
    void topCitiesContinentTest()
    {
        ArrayList<City> cities = queries.topCitiesContinent("South America", 15);
        assertEquals(cities.size(), 15);
        assertEquals(cities.get(0).getName(), "São Paulo");
        assertEquals(cities.get(1).getName(), "Lima");
        assertEquals(cities.get(2).getName(), "Santafé de Bogotá");
    }
    @Test
    void topCitiesRegionTest()
    {
        ArrayList<City> cities = queries.topCitiesRegion("Central Africa", 12);
        assertEquals(cities.size(), 12);
        assertEquals(cities.get(0).getName(), "Kinshasa");
        assertEquals(cities.get(1).getName(), "Luanda");
        assertEquals(cities.get(2).getName(), "Douala");
    }
    @Test
    void topCitiesCountryTest()
    {
        ArrayList<City> cities = queries.topCitiesCountry("Russian Federation", 5);
        assertEquals(cities.size(), 5);
        assertEquals(cities.get(0).getName(), "Moscow");
        assertEquals(cities.get(1).getName(), "St Petersburg");
        assertEquals(cities.get(2).getName(), "Novosibirsk");
    }
    @Test
    void topCitiesDistrictTest()
    {
        ArrayList<City> cities = queries.topCitiesDistrict("California", 3);
        assertEquals(cities.size(), 3);
        assertEquals(cities.get(0).getName(), "Los Angeles");
        assertEquals(cities.get(1).getName(), "San Diego");
        assertEquals(cities.get(2).getName(), "San Jose");
    }

    // CAPITALS

    @Test
    void allCapitalsGlobalTest()
    {
        ArrayList<City> capitals = queries.allCapitalsGlobal();
        assertEquals(capitals.size(), 232);
    }
    @Test
    void allCapitalsContinentTest()
    {
        ArrayList<City> capitals = queries.allCapitalsContinent("Europe");
        assertEquals(capitals.size(), 46);
        assertEquals(capitals.get(0).getName(), "Moscow");
        assertEquals(capitals.get(1).getName(), "London");
        assertEquals(capitals.get(2).getName(), "Berlin");
    }
    @Test
    void allCapitalsRegionTest()
    {
        ArrayList<City> capitals = queries.allCapitalsRegion("Eastern Europe");
        assertEquals(capitals.size(), 10);
        assertEquals(capitals.get(0).getName(), "Moscow");
        assertEquals(capitals.get(1).getName(), "Kyiv");
        assertEquals(capitals.get(2).getName(), "Bucuresti");
    }
    @Test
    void topCapitalsGlobalTest()
    {
        ArrayList<City> capitals = queries.topCapitalsGlobal(8);
        assertEquals(capitals.size(), 8);
        assertEquals(capitals.get(0).getName(), "Seoul");
        assertEquals(capitals.get(1).getName(), "Jakarta");
        assertEquals(capitals.get(2).getName(), "Ciudad de México");
    }
    @Test
    void topCapitalsContinentTest()
    {
        ArrayList<City> capitals = queries.topCapitalsContinent("South America", 15);
        assertEquals(capitals.size(), 14);
        assertEquals(capitals.get(0).getName(), "Lima");
        assertEquals(capitals.get(1).getName(), "Santafé de Bogotá");
        assertEquals(capitals.get(2).getName(), "Santiago de Chile");
    }
    @Test
    void topCapitalsRegionTest()
    {
        ArrayList<City> capitals = queries.topCapitalsRegion("Middle East", 10);
        assertEquals(capitals.size(), 10);
        assertEquals(capitals.get(0).getName(), "Baghdad");
        assertEquals(capitals.get(1).getName(), "Riyadh");
        assertEquals(capitals.get(2).getName(), "Ankara");
    }
}