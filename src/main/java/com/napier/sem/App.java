/**
 * This is the primary entry point of the program.
 * Application extracts and processes data from a MySQL database.
 * Created by: Scott Langmead, Matthew Wilson, Md Saifullah and Rowen Peebles (Group 11)
 * Created at: Edinburgh Napier University (Software Engineering Methods Module)
 **/

package com.napier.sem;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();
        Queries q = new Queries();

        // Connect to database
        q.connect("db:3306", 30);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the countries in the world organised by largest population to smallest
        ArrayList<Country> allCountriesGlobal = q.allCountriesGlobal();
        q.printCountries(allCountriesGlobal);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the countries in a continent organised by largest population to smallest
        ArrayList<Country> allCountriesContinent = q.allCountriesContinent("Asia");
        q.printCountries(allCountriesContinent);

        System.out.print("\n\n\n\n\n"); // Space out results


        // All the countries in a region organised by largest population to smallest
        ArrayList<Country> allCountriesRegion = q.allCountriesRegion("Caribbean");
        q.printCountries(allCountriesRegion);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated countries in the world where N is provided by the user
        ArrayList<Country> countries = q.topCountriesGlobal(10);
        q.printCountries(countries);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated countries in a continent where N is provided by the user
        ArrayList<Country> topCountriesContinent = q.topCountriesContinent(15, "Europe");
        q.printCountries(topCountriesContinent);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated countries in a region where N is provided by the user
        ArrayList<Country> topCountriesRegion = q.topCountriesRegion(5, "Middle East");
        q.printCountries(topCountriesRegion);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the cities in the world organised by largest population to smallest
        ArrayList<City> allCitiesGlobal = q.allCitiesGlobal();
        q.printCities(allCitiesGlobal);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the cities in a continent organised by largest population to smallest
        ArrayList<City> allCitiesContinent = q.allCitiesContinent("Oceania");
        q.printCities(allCitiesContinent);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the cities in a region organised by largest population to smallest
        ArrayList<City> allCitiesRegion = q.allCitiesRegion("Western Europe");
        q.printCities(allCitiesRegion);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the cities in a country organised by largest population to smallest
        ArrayList<City> allCitiesCountry = q.allCitiesCountry("United Kingdom");
        q.printCities(allCitiesCountry);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the cities in a district organised by largest population to smallest
        ArrayList<City> allCitiesDistrict = q.allCitiesDistrict("Scotland");
        q.printCities(allCitiesDistrict);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated cities in the world where N is provided by the user
        ArrayList<City> topCitiesGlobal = q.topCitiesGlobal(12);
        q.printCities(topCitiesGlobal);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated cities in a continent where N is provided by the user
        ArrayList<City> topCitiesContinent = q.topCitiesContinent("South America", 18);
        q.printCities(topCitiesContinent);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated cities in a region where N is provided by the user
        ArrayList<City> topCitiesRegion = q.topCitiesRegion("Central Africa", 8);
        q.printCities(topCitiesRegion);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated cities in a country where N is provided by the user
        ArrayList<City> topCitiesCountry = q.topCitiesCountry("Russian Federation", 24);
        q.printCities(topCitiesCountry);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated cities in a district where N is provided by the user
        ArrayList<City> topCitiesDistrict = q.topCitiesDistrict("California", 6);
        q.printCities(topCitiesDistrict);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the capital cities in the world organised by largest population to smallest
        ArrayList<City> allCapitalsGlobal = q.allCapitalsGlobal();
        q.printCapitals(allCapitalsGlobal);


        System.out.print("\n\n\n\n\n"); // Space out results

        // All the capital cities in a continent organised by largest population to smallest
        ArrayList<City> allCapitalsContinent = q.allCapitalsContinent("Europe");
        q.printCapitals(allCapitalsContinent);

        System.out.print("\n\n\n\n\n"); // Space out results

        // All the capital cities in the world organised by largest population to smallest
        ArrayList<City> allCapitalsRegion = q.allCapitalsRegion("Eastern Europe");
        q.printCapitals(allCapitalsRegion);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated capital cities in the world where N is provided by the user
        ArrayList<City> topCapitalsGlobal = q.topCapitalsGlobal(10);
        q.printCapitals(topCapitalsGlobal);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated capital cities in a continent where N is provided by the user
        ArrayList<City> topCapitalsContinent = q.topCapitalsContinent("South America", 8);
        q.printCapitals(topCapitalsContinent);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The top N populated capital cities in a region where N is provided by the user
        ArrayList<City> topCapitalsRegion = q.topCapitalsRegion("Middle East", 12);
        q.printCapitals(topCapitalsRegion);

        // Disconnect from database
        q.disconnect();
    }
}
