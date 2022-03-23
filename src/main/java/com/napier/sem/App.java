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


        // All the countries in the world organised by largest population to smallest
        /*
        ArrayList<Country> countries = q.allCountriesGlobal();
        q.printCountries(countries);
        */

        // All the countries in a continent organised by largest population to smallest (Asia)
        /*
        ArrayList<Country> countries = q.allCountriesContinent();
        q.printCountries(countries);
         */

        // All the countries in a region organised by largest population to smallest
        ArrayList<Country> countries = q.allCountriesRegion();
        q.printCountries(countries);

        // The top N populated countries in the world where N is provided by the user
        /*
        ArrayList<Country> countries = q.topCountriesGlobal(0);
        q.printCountries(countries);
         */

        // The top N populated countries in a continent where N is provided by the user
        /*
        ArrayList<Country> countries = q.topCountriesContinent(0);
        q.printCountries(countries);
         */

        // The top N populated countries in a region where N is provided by the user
        /*
        ArrayList<Country> countries = q.topCountriesRegion(0);
        q.printCountries(countries);
        */


        // Disconnect from database
        q.disconnect();
    }
}