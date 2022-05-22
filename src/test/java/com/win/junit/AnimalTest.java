package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTest {

// Test 2 / using assertNull

@DisplayName("test if name is null")
@Test

void isNameNull(){

    Animal animal = new Animal(false);

    assertNull(animal.getName());

}

    
}
