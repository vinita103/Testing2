package com.win.junit;


import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {

       if (isBoiling()){

        System.out.println("Water is boiling!");

       }

    }

    public static boolean isBoiling(){

     Scanner data = new Scanner (System.in);

     System.out.println("Enter a number greater than 212: ");
      int num = data.nextInt();

      data.close();

      if ( num > 212) {

           return true;
      }
      return false;

           
    }

   
}


