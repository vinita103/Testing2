package com.win.junit;

// creating product class
// defining three attributes

public class Product {

    public double productCost;
    public int quantity;
    public String productName;
    
    // creating constructor of Product 
    // assigning 3 attributes as parameter
    
    public Product (double productCost, int quantity, String productName){
    
          this.productCost = productCost;
          this.quantity = quantity;
          this.productName = productName;
    
    }
    
    // creating totalCost method
    
    public void totalCost(){
    
        System.out.println("Total Cost is " + getTotalCost());
    
    }


    public double getTotalCost(){

        return productCost*quantity;
    }
    
    // creating printProduct method
    
    public void printProduct(){
    
        System.out.println(productName + " costs " + productCost + " and " + quantity + " units were purchased");
    
    }
    
        
    }