package com.win.junit;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

// Test 5 - testing two doubles using assertTrue

public class ProductTest {

    @DisplayName ("test totalCost method")
    @Test

    public void totalCostTest(){
        Product product = new Product(5.0, 5, "Candy");

       
        assertTrue(25.0 == product.getTotalCost());

}

}
