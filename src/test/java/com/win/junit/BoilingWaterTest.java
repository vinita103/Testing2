package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoilingWaterTest{

    // Test-3 / using Assert True and Input Stream


    @DisplayName("test isBoiling()Method - if it returns true")
    @Test

    void isBoilingTest(){
        String number = "250";

        InputStream input = new ByteArrayInputStream(number.getBytes());
        System.setIn(input);

        assertTrue(BoilingWater.isBoiling());
    }
 

}