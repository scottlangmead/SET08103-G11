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
        App t = new App();
        Queries q = new Queries();

        // Connect to database
        q.connect();

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

        // Disconnect from database
        q.disconnect();
    }
}