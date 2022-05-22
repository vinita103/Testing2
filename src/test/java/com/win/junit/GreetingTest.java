package com.win.junit;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// import com.win.junit.Greeting;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class GreetingTest{

// Test 4/ testing user input using Scanner

@DisplayName("Test to see if we get the user input")
@Test

public void getNameTest(){
    String userInput = "anyName";

    InputStream input = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(input);

    assertEquals("anyName", Greeting.getName());

    

}
    
}
