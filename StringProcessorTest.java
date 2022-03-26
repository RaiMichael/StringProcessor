package com.example.StringProcessor;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    @Test
    void StringTester1()
    {
        StringProcessor stringProcessor = new StringProcessor();
        List<String> names = new ArrayList<String>();
        names.add("Melbourne");
        names.add("Sydney");
        names.add("Perth");
        names.add("Goa");
        names.add("Canberra");
        names.add("Minion");
        names.add("Mike");
        names.add("Microsoft");
        List<String> resultNames = new ArrayList<>();
        resultNames.add("Melbourne");
        resultNames.add("Sydney");
        resultNames.add("Canberra");
        resultNames.add("Minion");
        resultNames.add("Microsoft");
        ReturnedValue expectedResult = new ReturnedValue(4,resultNames);
        ReturnedValue actualResult = stringProcessor.StringProcessor(names);
        if(expectedResult.words.equals(actualResult.words) && expectedResult.numberOfStrings == expectedResult.numberOfStrings)
        {
            assertTrue( true);
        }
        else {
            assertTrue(false);
        }
    }
    @Test
    void StringTester2()
    {
        StringProcessor stringProcessor = new StringProcessor();
        List<String> names = new ArrayList<String>();
        names.add("Melbo");
        names.add("Syd");
        names.add("Perth");
        names.add("Goa");
        names.add("Canb");
        names.add("Min");
        names.add("Mike");
        names.add("Mic");
        List<String> resultNames = new ArrayList<>();
        ReturnedValue expectedResult = new ReturnedValue(4,resultNames);
        ReturnedValue actualResult = stringProcessor.StringProcessor(names);
        if(expectedResult.words.equals(actualResult.words) && expectedResult.numberOfStrings == expectedResult.numberOfStrings)
        {
            assertTrue( true);
        }
        else {
            assertTrue(false);
        }
    }
}