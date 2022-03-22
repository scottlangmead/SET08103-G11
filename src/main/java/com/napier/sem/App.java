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

        //ArrayList<City> cities = q.getCitiesUnderID(5);
        //q.printCities(cities);

        ArrayList<Country> countries = q.allCountriesGlobal();
        q.printCountries(countries);


        // Disconnect from database
        q.disconnect();
    }
}