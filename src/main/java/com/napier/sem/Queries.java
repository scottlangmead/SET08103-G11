package com.napier.sem;
import java.sql.*;
import java.util.ArrayList;

public class Queries {

    public ArrayList<City> getCitiesUnderID(int ID)
    {
        // Holds a list of cities
        ArrayList<City> cities = new ArrayList<>();

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                "SELECT ID, Name, CountryCode, District, Population "
                    + "FROM city "
                    + "WHERE ID < " + ID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Define city
            City city = new City();

            while (rset.next())
            {
                // Extract data from SQL result
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


    public void displayCities(ArrayList<City> cities)
    {

        //ArrayList<City> cities = new ArrayList<>();


        //City city = new City();

        /*
        city.id = 1;
        city.name = "Edinburgh";
        city.countryCode = "1";
        city.district = "A";
        city.population = 3333;
        cities.add(city);


        city.id = 2;
        city.name = "Glasgow";
        city.countryCode = "2";
        city.district = "B";
        city.population = 666666;
        cities.add(city);


        city.id = 3;
        city.name = "Dundee";
        city.countryCode = "3";
        city.district = "C";
        city.population = 436346346;
        cities.add(city);
        */



        if (cities != null || !cities.isEmpty())
        {
            // print titles
            System.out.println(String.format("%4s %-4s %-44s %-14s %-25s", "ID", "Name", "CountryCode", "District", "Population"));

            for (City c : cities)
            {
                if (c == null)
                    continue;





                String cityText = String.format("%4s %-4s %-44s %-14s %-25s",
                    c.getId(), c.getName(), c.getCountryCode(), c.getDistrict(), c.getPopulation());

                System.out.println(cityText);
            }
        }
        else
            System.out.println("No cities");
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