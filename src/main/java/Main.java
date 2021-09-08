/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class Scanner

public class Main {
    // main method begins execution of Java application
    public static void main (String[] args){
        Scanner paint = new Scanner(System.in); //Scanner to obtain input

        System.out.println("What is the length of the ceiling in feet? ");
        String length = paint.nextLine();   //Reads the length of the ceiling from the user
        double Length = Double.parseDouble(length); //Converts user input from String to double

        System.out.println("What is the width of the ceiling in feet? ");
        String width = paint.nextLine();    //Reads the width of the ceiling from the user
        double Width = Double.parseDouble(width); //Converts user input from String to double

        double area = Length * Width;   //Formula to get the area
        final double constant = 350;    //Constant
        //Formula to get the gallon and using (Math.ceil) to get the ceiling value
        double gallon = Math.ceil(area / constant);
        //Displays the area and total gallons of paint needed
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet." , gallon, area);
    }
}
