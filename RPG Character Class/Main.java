package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String[] AvailableClasses = new String[] {"Fighter","Paladin","Ranger","Wizard","Thief"};
        RpgCharacterClass myCharacter = new RpgCharacterClass("Draugr","Male","Fighter", "Human",
                                                              18,12,15,9,11,10);

        System.out.println("Available Character Classes" );
        System.out.println("***************************" );

        for (String AvailableClass:
                Arrays.asList(AvailableClasses)
             ) {
            System.out.println(AvailableClass);
        }
        System.out.println("***************************" );
        System.out.println(" " );
        System.out.println(myCharacter);
        System.out.println("---------------------------" );
    }
}
