package com.napier.sem;
import java.sql.*;
import java.util.ArrayList;

public class Queries {

    /**
     *
     * @return List of all countries in the world, ordered from largest to smallest
     */
    public ArrayList<Country> allCountriesGlobal()
    {
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                + " ORDER BY country.Population DESC ");
    }

    public static void printCountries(ArrayList<Country> countries)
    {
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println(String.format("%-5s %-50s %-20s %-30s %-20s %-5s",
                "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country country : countries)
        {
            if (country == null)
            {
                continue;
            }
            System.out.println(String.format("%-5s %-50s %-20s %-30s %-20s %-5s",
                    country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital()));
        }
    }

    /**
     *
     * @param ID
     * @return
     */
    public ArrayList<City> getCitiesUnderID(int ID)
    {
        return cityBaseQuery(
                "SELECT ID, Name, CountryCode, District, Population "
                + "FROM city "
                + "WHERE ID < " + ID);
    }

    public static void printCities(ArrayList<City> cities)
    {
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println(String.format("%-30s %-30s %-35s %-20s", "Name", "Country", "District", "Population"));
        // Loop over all countries in the list
        for (City city : cities)
        {
            if (city == null)
            {
                continue;
            }
            System.out.println(String.format("%-30s %-30s %-35s %-20s", city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation()));
        }
    }

    public ArrayList<Country> countryBaseQuery(String query)
    {
        // Holds a list of queried results
        ArrayList<Country> countries = new ArrayList<Country>();

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            while (rset.next())
            {
                // Define city
                Country country = new Country();

                // Extract data from SQL query result
                country.setCode(rset.getString("Code"));
                country.setName(rset.getString("Name"));
                country.setContinent(rset.getString("Continent"));
                country.setRegion(rset.getString("Region"));
                country.setPopulation(rset.getInt("Population"));

                // NOTE: this is set to string as we are taking it currently from the city table
                country.setCapital(rset.getString("Capital"));

                // Add city to list
                countries.add(country);
            }

            // Return list of cities
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve country details");
            return null;
        }
    }

    public ArrayList<City> cityBaseQuery(String query)
    {
        // Holds a list of queried results
        ArrayList<City> cities = new ArrayList<City>();

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            while (rset.next())
            {
                // Define city
                City city = new City();

                // Extract data from SQL query result
                city.setId(rset.getInt("ID"));
                city.setName(rset.getString("Name"));
                city.setCountryCode(rset.getString("CountryCode"));
                city.setDistrict(rset.getString("District"));
                city.setPopulation(rset.getInt("Population"));

                // Add city to list
                cities.add(city);
            }

            // Return list of cities
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve city details");
            return null;
        }
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
}