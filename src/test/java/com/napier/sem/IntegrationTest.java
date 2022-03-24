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

    @Test
    void defaultTest()
    {
        assertEquals(5, 5);
    }
}