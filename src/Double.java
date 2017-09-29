// Annie Wong
// CS 110B
// Project 2 - Double Up

/*
Minimum Requirements:

Create a class that has 3 methods.
A mutator method should take the number from the user and store it in a private variable. (5 points)
Another method should perform the calculations, display the double up results and store the total in a private variable.
This method must use a loop. (5 points)
An accessor method should display the total. (5 points)
Create a main method that creates an object of your class and calls each of the methods of the class. (5 points)
*/

import java.util.Scanner;

public class Double {
    private static int userInputNum;

    public static void main(String[] args) {
        getUserInput();
    }

    public static void getUserInput() {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // user input validation
        do {
            userInputNum = number.nextInt();
            if (userInputNum <= 20) {
                displayTotal(userInputNum);
            } else if (userInputNum > 20) {
                System.out.println("Invalid input. Please enter a number between 1-20");
            }
        } while (userInputNum > 20);
    }

/*
    public static void calculate(int num) {

    }
*/

    public static int displayTotal(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Double up " + i + " = " + i * 2);
            total += i * 2;
        }
        System.out.println("Total = " + total);
        return total;

    }


}

