/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for order amount
    what state do they live in
    also what county do they live in
    display the tax amount
    display the total amount including tax



 */


import java.util.Scanner;

public class solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        int amount = sc.nextInt();

        System.out.println("What state do you live in? ");
        String state = sc.next();
        if(state.equals("Wisconsin")){
            System.out.println("What county do you live in? ");
            String county = sc.next();
            if(county.equals("EauClaire")){
                double tax = (amount * 5.005)/100;
                double Eauamount = tax + amount;
            }
            else if(county.equals("Dunn")){
                double tax = (amount * 5.004)/100;
                double Dunnamount = tax + amount;
            }
            else {
                System.out.println("Please enter a different different county");
        }
            else if(state.equals("Illinois")){
                double tax = (amount * 8)/100;
                double Illamount = tax + amount;
            }
            else {
                double tax = 0.0;
                double Illamount = amount;
            }
        }
        System.out.println("The tax is "+(tax)".");
        System.out.println("The total is "+(total)".");
    }
}
