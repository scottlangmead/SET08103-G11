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
        Queries q = new Queries();

        // Connect to database
        if(args.length < 1){
            q.connect("localhost:33060", 30000);
        }else{
            q.connect(args[0], Integer.parseInt(args[1]));
        }

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

        System.out.print("\n\n\n"); // Space out results

        // The population of the world
        long globalPopulation = q.globalPopulation();
        System.out.print(globalPopulation);

        System.out.print("\n\n"); // Space out results

        // The population of a continent
        long continentPopulation = q.continentPopulation("Asia");
        System.out.print(continentPopulation);

        System.out.print("\n\n"); // Space out results

        // The population of a region
        long regionPopulation = q.regionPopulation("Middle East");
        System.out.print(regionPopulation);

        System.out.print("\n\n"); // Space out results

        // The population of a country
        long countryPopulation = q.countryPopulation("Germany");
        System.out.print(countryPopulation);

        System.out.print("\n\n"); // Space out results

        // The population of a district
        long districtPopulation = q.districtPopulation("Scotland");
        System.out.print(districtPopulation);

        System.out.print("\n\n"); // Space out results

        // The population of a city
        long cityPopulation = q.cityPopulation("London");
        System.out.print(cityPopulation);

        System.out.print("\n\n\n"); // Space out results

        // The population of people, people living in cities, and people not living in cities in each continent
        ArrayList<Population> continentPopulations = q.popReportContinent();
        q.printPopulation(continentPopulations);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The population of people, people living in cities, and people not living in cities in each region
        ArrayList<Population> regionPopulations = q.popReportRegion();
        q.printPopulation(regionPopulations);

        System.out.print("\n\n\n\n\n"); // Space out results

        // The population of people, people living in cities, and people not living in cities in each country
        ArrayList<Population> countryPopulations = q.popReportCountry();
        q.printPopulation(countryPopulations);

        System.out.print("\n\n\n"); // Space out results

        // Disconnect from database
        q.disconnect();
    }
}
