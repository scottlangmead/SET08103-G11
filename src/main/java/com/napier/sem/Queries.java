package com.napier.sem;
import java.sql.*;
import java.util.ArrayList;

/**
 * Contains functions to interact with the database.
 * @author Scott Langmead, Matthew Wilson, Md Saifullah
 */
public class Queries {

    /**
     * @return All the countries in the world organised by largest population to smallest
     */
    public ArrayList<Country> allCountriesGlobal()
    {
        System.out.println("All the countries in the world organised by largest population to smallest:");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "ORDER BY country.Population DESC ", 0);
    }
    /**
     * @param continent The continent to be displayed
     * @return All the countries in a continent organised by largest population to smallest (Asia)
     */
    public ArrayList<Country> allCountriesContinent(String continent)
    {
        System.out.println("All the countries in " + continent + ", organised by largest population to smallest:");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "WHERE country.Continent = '" + continent + "' "
                        + "ORDER BY country.Population DESC ", 0);
    }
    /**
     * @param region The region to be displayed
     * @return All the countries in a region organised by largest population to smallest (Caribbean)
     */
    public ArrayList<Country> allCountriesRegion(String region)
    {
        System.out.println("All the countries in the " + region + ", organised by largest population to smallest:");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "WHERE country.Region = '" + region + "' "
                        + "ORDER BY country.Population DESC ", 0);
    }

    /**
     * @param n How many countries are to be displayed
     * @return The top N populated countries in the world where N is provided by the user
     */
    public ArrayList<Country> topCountriesGlobal(int n)
    {
        System.out.println("The top " + n + " populated countries in the world:");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "ORDER BY country.Population DESC ", n);
    }
    /**
     * @param n How many countries are to be displayed
     * @param continent The continent to be displayed
     * @return The top N populated countries in a continent where N is provided by the user
     */
    public ArrayList<Country> topCountriesContinent(int n, String continent)
    {
        System.out.println("The top " + n + " populated countries in " + continent + ":");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "WHERE country.Continent = '" + continent + "' "
                        + "ORDER BY country.Population DESC ", n);
    }
    /**
     * @param n How many countries are to be displayed
     * @param region The region to be displayed
     * @return The top N populated countries in a region where N is provided by the user
     */
    public ArrayList<Country> topCountriesRegion(int n, String region)
    {
        System.out.println("The top " + n + " populated countries in the " + region + ":");
        return countryBaseQuery(
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name AS 'Capital' "
                        + "FROM country LEFT JOIN city ON country.Capital = city.ID "
                        + "WHERE country.Region = '" + region + "' "
                        + "ORDER BY country.Population DESC ", n);
    }

    /**
     * @return All the cities in the world organised by largest population to smallest
     */
    public ArrayList<City> allCitiesGlobal()
    {
        System.out.println("All the cities in the world organised by largest population to smallest:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param continent The continent to be displayed
     * @return All the cities in a continent organised by largest population to smallest
     */
    public ArrayList<City> allCitiesContinent(String continent)
    {
        System.out.println("All the cities in " + continent + " organised by largest population to smallest:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Continent = '" + continent + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param region The region to be displayed
     * @return All the cities in a region organised by largest population to smallest
     */
    public ArrayList<City> allCitiesRegion(String region)
    {
        System.out.println("All the cities in " + region + " organised by largest population to smallest:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Region = '" + region + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param country The region to be displayed
     * @return All the cities in a region organised by largest population to smallest
     */
    public ArrayList<City> allCitiesCountry(String country)
    {
        System.out.println("All the cities in the " + country + " organised by largest population to smallest:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Name = '" + country + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param district The district to be displayed
     * @return All the cities in a region organised by largest population to smallest
     */
    public ArrayList<City> allCitiesDistrict(String district)
    {
        System.out.println("All the cities in " + district + " organised by largest population to smallest:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.District = '" + district + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }

    /**
     * @param n How many cities are to be displayed
     * @return The top N populated cities in the world where N is provided by the user
     */
    public ArrayList<City> topCitiesGlobal(int n)
    {
        System.out.println("The top " + n + " populated cities in the world:");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param continent The continent to be displayed
     * @param n How many cities are to be displayed
     * @return The top N populated cities in a continent where N is provided by the user
     */
    public ArrayList<City> topCitiesContinent(String continent, int n)
    {
        System.out.println("The top " + n + " populated cities in the " + continent + ":");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Continent = '" + continent + "' "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param region The region to be displayed
     * @param n How many cities are to be displayed
     * @return The top N populated cities in a region where N is provided by the user
     */
    public ArrayList<City> topCitiesRegion(String region, int n)
    {
        System.out.println("The top " + n + " populated cities in " + region + ":");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Region = '" + region + "' "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param country The region to be displayed
     * @param n How many cities are to be displayed
     * @return The top N populated cities in a country where N is provided by the user
     */
    public ArrayList<City> topCitiesCountry(String country, int n)
    {
        System.out.println("The top " + n + " populated cities in " + country +":");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE country.Name = '" + country + "' "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param district The district to be displayed
     * @param n How many cities are to be displayed
     * @return The top N populated cities in a district where N is provided by the user
     */
    public ArrayList<City> topCitiesDistrict(String district, int n)
    {
        System.out.println("The top " + n + " populated cities in " + district + ":");
        return cityBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.District, city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.District = '" + district + "' "
                        + "ORDER BY city.Population DESC ", n);
    }

    /**
     * @return All the capital cities in the world organised by largest population to smallest
     */
    public ArrayList<City> allCapitalsGlobal()
    {
        System.out.println("All the capital cities in the world organised by largest population to smallest:");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param continent The continent to be displayed
     * @return All the capital cities in a continent organised by largest population to smallest
     */
    public ArrayList<City> allCapitalsContinent(String continent)
    {
        System.out.println("All the capital cities in " + continent + " organised by largest population to smallest:");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital AND country.Continent = '" + continent + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param region The region to be displayed
     * @return All the capital cities in a region organised by largest to smallest
     */
    public ArrayList<City> allCapitalsRegion(String region)
    {
        System.out.println("All the capital cities in a " + region + " organised by largest to smallest:");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital AND country.Region = '" + region + "' "
                        + "ORDER BY city.Population DESC ", 0);
    }
    /**
     * @param n How many capitals are to be displayed
     * @return The top N populated capital cities in the world where N is provided by the user
     */
    public ArrayList<City> topCapitalsGlobal(int n)
    {
        System.out.println("The top " + n + " populated capital cities in the world:");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param continent The continent to be displayed
     * @param n How many capitals are to be displayed
     * @return The top N populated capital cities in a continent where N is provided by the user
     */
    public ArrayList<City> topCapitalsContinent(String continent, int n)
    {
        System.out.println("The top " + n + " populated capital cities in " + continent + ":");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital AND country.Continent = '" + continent + "' "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @param region The region to be displayed
     * @param n How many capitals are to be displayed
     * @return The top N populated capital cities in a region where N is provided by the user
     */
    public ArrayList<City> topCapitalsRegion(String region, int n)
    {
        System.out.println("The top " + n + " populated capital cities in the " + region + ":");
        return capitalBaseQuery(
                "SELECT city.Name, country.Name AS 'Country', city.Population "
                        + "FROM city JOIN country ON city.CountryCode = country.Code "
                        + "WHERE city.ID = country.Capital AND country.Region = '" + region + "' "
                        + "ORDER BY city.Population DESC ", n);
    }
    /**
     * @return The population of the world
     */
    public long globalPopulation()
    {
        System.out.println("The population of the World:");
        return populationBaseQuery(
                "SELECT SUM(Population) AS 'Population' "
                    + "FROM country ");
    }
    /**
     * @param continent The continent to be displayed
     * @return The population of a Continent
     */
    public long continentPopulation(String continent)
    {
        System.out.println("The population of " + continent + ":");
        return populationBaseQuery(
                "SELECT SUM(Population) AS 'Population' "
                    + "FROM country "
                    + "WHERE continent = '" + continent + "'");
    }
    /**
     * @param region The region to be displayed
     * @return The population of a Region
     */
    public long regionPopulation(String region)
    {
        System.out.println("The population of the " + region + ":");
        return populationBaseQuery(
                "SELECT SUM(Population) AS 'Population' "
                    + "FROM country "
                    + "WHERE region = '" + region + "'");
    }
    /**
     * @param country The country to be displayed
     * @return The population of a Country
     */
    public long countryPopulation(String country)
    {
        System.out.println("The population of " + country + ":");
        return populationBaseQuery(
                "SELECT Population "
                    + "FROM country "
                    + "WHERE name = '" + country + "'");
    }
    /**
     * @param district The district to be displayed
     * @return The population of a District
     */
    public long districtPopulation(String district)
    {
        System.out.println("The population of " + district + ":");
        return populationBaseQuery(
                "SELECT SUM(Population) AS 'Population' "
                    + "FROM city "
                    + "WHERE district = '" + district + "'");
    }
    /**
     * @param city The city to be displayed
     * @return The population of a City
     */
    public long cityPopulation(String city)
    {
        System.out.println("The population in " + city + ":");
        return populationBaseQuery(
                "SELECT Population "
                    + "FROM city "
                    + "WHERE name = '" + city + "'");
    }
    /**
     * @return The population of people, people living in cities, and people not living in cities in each continent
     */
    public ArrayList<Population> popReportContinent()
    {
        System.out.println("The population of people, people living in cities, and people not living in cities in each continent:");
        return populationReportBaseQuery(
                "SELECT country.continent AS 'Name', SUM(DISTINCT country.population) AS 'CountryPopulation', SUM(city.population) AS 'CityPopulation' "
                    + "FROM city JOIN country ON city.CountryCode = country.Code "
                    + "GROUP BY country.continent ");
    }
    /**
     * @return The population of people, people living in cities, and people not living in cities in each region
     */
    public ArrayList<Population> popReportRegion()
    {
        System.out.println("The population of people, people living in cities, and people not living in cities in each region:");
        return populationReportBaseQuery(
                "SELECT country.region AS 'Name', SUM(DISTINCT country.population) AS 'CountryPopulation', SUM(city.population) AS 'CityPopulation' "
                    + "FROM city JOIN country ON city.CountryCode = country.Code "
                    + "GROUP BY country.region ");
    }
    /**
     * @return The population of people, people living in cities, and people not living in cities in each country
     */
    public ArrayList<Population> popReportCountry()
    {
        System.out.println("The population of people, people living in cities, and people not living in cities in each country:");
        return populationReportBaseQuery(
                "SELECT country.name AS 'Name', SUM(DISTINCT country.population) AS 'CountryPopulation', SUM(city.population) AS 'CityPopulation' "
                    + "FROM city JOIN country ON city.CountryCode = country.Code "
                    + "GROUP BY country.name ");
    }

    /**
     * Searches database using provided SQL query.
     * @param query SQL query
     * @param n How many countries are to be displayed (0 = all)
     * @return List of results (countries)
     */
    public ArrayList<Country> countryBaseQuery(String query, int n)
    {
        // Holds a list of queried results
        ArrayList<Country> countries = new ArrayList<Country>();

        // Check if query is null
        if (query == null || query == "")
        {
            System.out.println("Invalid query");
            return countries;
        }

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            // Counts the number of printed results
            int counter = 0;

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
                // NOTE: We are taking Capital from the city table, therefore it's a String not an Integer
                country.setCapital(rset.getString("Capital"));

                // Add country to list
                countries.add(country);

                // If display specified number of results
                if (n > 0)
                {
                    // Increment counter
                    counter++;

                    // If specified number of results is reached
                    if (counter == n)
                        break;  // End loop
                }
            }

            // Check if less countries than n
            if (countries.size() < n)
                System.out.println("WARNING: There aren't enough countries to fulfill " + n + " results.");

            // Return list of countries
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve country details");
            return null;
        }
    }
    /**
     * Searches database using provided SQL query.
     * @param query SQL query
     * @param n How many cities are to be displayed (0 = all)
     * @return List of results (cities)
     */
    public ArrayList<City> cityBaseQuery(String query, int n)
    {
        // Holds a list of queried results
        ArrayList<City> cities = new ArrayList<City>();

        // Check if query is null
        if (query == null || query == "")
        {
            System.out.println("Invalid query");
            return cities;
        }

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            // Counts the number of printed results
            int counter = 0;

            while (rset.next())
            {
                // Define city
                City city = new City();

                // Extract data from SQL query result
                city.setName(rset.getString("Name"));
                city.setCountryCode(rset.getString("Country"));
                city.setDistrict(rset.getString("District"));
                city.setPopulation(rset.getInt("Population"));

                // Add city to list
                cities.add(city);

                // If display specified number of results
                if (n > 0)
                {
                    // Increment counter
                    counter++;

                    // If specified number of results is reached
                    if (counter == n)
                        break;  // End loop
                }
            }

            // Check if less cities than n
            if (cities.size() < n)
                System.out.println("WARNING: There aren't enough cities to fulfill " + n + " results.");

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
     * Searches database using provided SQL query.
     * @param query SQL query
     * @param n How many capitals are to be displayed (0 = all)
     * @return List of results (capitals)
     */
    public ArrayList<City> capitalBaseQuery(String query, int n)
    {
        // Holds a list of queried results
        ArrayList<City> capitals = new ArrayList<City>();

        // Check if query is null
        if (query == null || query == "")
        {
            System.out.println("Invalid query");
            return capitals;
        }

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            // Counts the number of printed results
            int counter = 0;

            while (rset.next())
            {
                // Define city
                City city = new City();

                // Extract data from SQL query result
                city.setName(rset.getString("Name"));
                city.setCountryCode(rset.getString("Country"));
                city.setPopulation(rset.getInt("Population"));

                // Add city to list
                capitals.add(city);

                // If display specified number of results
                if (n > 0)
                {
                    // Increment counter
                    counter++;

                    // If specified number of results is reached
                    if (counter == n)
                        break;  // End loop
                }
            }

            // Check if less cities than n
            if (capitals.size() < n)
                System.out.println("WARNING: There aren't enough capitals to fulfill " + n + " results.");

            // Return list of cities
            return capitals;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve city details");
            return null;
        }
    }
    /**
     * @param query SQL query
     * @return The population of an area
     */
    public long populationBaseQuery(String query)
    {
        // Holds population of an area
        long population = -1;

        // Check if query is null
        if (query == null || query == "")
        {
            System.out.println("Invalid query");
            return population;
        }

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            while (rset.next())
                // Extract data from SQL query result
                population = rset.getLong("Population");

            // Return global population
            return population;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve population details");
            return 0;
        }
    }
    /**
     * @param query SQL query
     * @return A report of the Population an area
     */
    public ArrayList<Population> populationReportBaseQuery(String query)
    {
        // Holds a list of queried results
        ArrayList<Population> populations = new ArrayList<Population>();

        // Check if query is null
        if (query == null || query == "")
        {
            System.out.println("Invalid query");
            return populations;
        }

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);

            while (rset.next())
            {
                // Define population
                Population population = new Population();

                // Extract data from SQL query result
                population.setName(rset.getString("Name"));
                population.setCountryPopulation(rset.getLong("CountryPopulation"));
                population.setCityPopulation(rset.getLong("CityPopulation"));

                // Add population to list
                populations.add(population);
            }

            // Return global population
            return populations;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve population details");
            return null;
        }
    }

    /**
     * Prints Country data.
     * @param countries List to be printed
     */
    public static void printCountries(ArrayList<Country> countries)
    {
        if (countries == null || countries.isEmpty())
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
                continue;

            System.out.println(String.format("%-5s %-50s %-20s %-30s %-20s %-5s",
                    country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital()));
        }
    }
    /**
     * Prints City data.
     * @param cities List to be printed
     */
    public static void printCities(ArrayList<City> cities)
    {
        if (cities == null || cities.isEmpty())
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println(String.format("%-45s %-45s %-30s %-10s", "Name", "Country", "District", "Population"));
        // Loop over all countries in the list
        for (City city : cities)
        {
            if (city == null)
                continue;

            System.out.println(String.format("%-45s %-45s %-30s %-10s", city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation()));
        }
    }
    /**
     * Prints Capital City data.
     * @param capitals List to be printed
     */
    public static void printCapitals(ArrayList<City> capitals)
    {
        if (capitals == null || capitals.isEmpty())
        {
            System.out.println("No capitals");
            return;
        }
        // Print header
        System.out.println(String.format("%-45s %-45s %-10s", "Name", "Country", "Population"));
        // Loop over all countries in the list
        for (City city : capitals)
        {
            if (city == null)
                continue;

            System.out.println(String.format("%-45s %-45s %-10s", city.getName(), city.getCountryCode(), city.getPopulation()));
        }
    }
    /**
     * Prints Population data.
     * @param populations List to be printed
     */
    public static void printPopulation(ArrayList<Population> populations)
    {
        if (populations == null || populations.isEmpty())
        {
            System.out.println("No populations");
            return;
        }
        // Print header
        System.out.println(String.format("%-40s %-20s %-25s %-25s %-25s %-25s", "Name", "Population", "Living In Cities", "Living Outside Cities", "Living In Cities (%)", "Living In Cities (%)"));
        // Loop over all countries in the list
        for (Population population : populations)
        {
            if (population == null)
                continue;

            // Calculations
            long livingOut = population.getCountryPopulation() - population.getCityPopulation();
            float livingInPercent = ((float)population.getCityPopulation() / (float)population.getCountryPopulation()) * 100;
            float livingOutPercent = (1 - ((float)population.getCityPopulation() / (float)population.getCountryPopulation())) * 100;

            System.out.println(String.format("%-40s %-20s %-25s %-25s %-25.2f %-25.2f", population.getName(), population.getCountryPopulation(), population.getCityPopulation(), livingOut, livingInPercent, livingOutPercent));
        }
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;
    /**
     * Connect to the MySQL database.
     */
    public void connect(String location, int delay)
    {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
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
