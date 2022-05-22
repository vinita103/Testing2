package com.win.junit;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        System.out.println("What's your name?");
        String name = getName();
        System.out.println("Hi " + name);
    }

    // Creating Method to get Name

    public static String getName(){
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        return Name;

      
    }

}
