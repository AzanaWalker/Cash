package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numofcents = 0;
        float changeback;
        do {
            System.out.println("How much change is owed?: ");
            changeback = keyboard.nextFloat();
        }while (changeback <= 0.00);


        int cents = Math.round(changeback * 100);


        while (cents >= 25)
        { numofcents++;
            cents -= 25;
        }
        while (cents >= 10)
        { numofcents++;
            cents -= 10;
        }
        while (cents >= 5)
        { numofcents++;
            cents -= 5;
        }
        while (cents >= 1)
        { numofcents++;
            cents -= 1;
        }


        System.out.println( "Number of coins required: " + numofcents);

    }
}