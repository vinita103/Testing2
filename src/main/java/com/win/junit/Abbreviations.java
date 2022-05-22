package com.win.junit;

import java.util.HashMap;


// creating  class and HashMap

public class Abbreviations {

    private HashMap< String, String> abbreviationMap = new HashMap<>();

    // Creating a constructor with no parameters

    public Abbreviations() {

    }

    public static void main(String[] args) {

        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc.  lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

    }

 //   creating a method to add abbreviation
    
    public  void addAbbreviation(String abbreviation, String explanation) {

        abbreviationMap.put(abbreviation, explanation);

    }

 //   creating a  boolean method to see if abbreviation has been added

    public  boolean hasAbbreviation(String abbreviation) {

        return abbreviationMap.get(abbreviation) != null;

    }

    //   creating a  boolean method to find explanation for  abbreviation

    public String findExplanationFor(String abbreviation) {

        return abbreviationMap.get(abbreviation);
    }

}