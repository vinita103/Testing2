package com.win.junit;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AbbreviationsTest {

    // Test 1 Parameterized Test 

    @DisplayName("Test if abbreviations can be added")
    @ParameterizedTest
    @ValueSource(strings = {"LOL", "OMG", "FYI"})
    
    void hasAbbreviationTest(String abbr) {

        Abbreviations abbreviation = new Abbreviations();

        abbreviation.addAbbreviation(abbr, "");
        assertTrue(abbreviation.hasAbbreviation(abbr));

    }

}