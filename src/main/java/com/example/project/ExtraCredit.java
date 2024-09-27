package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
        double tipAmount = Math.round((cost * (percent * 0.01)) * 100) / 100.0; // tip amount; multiplies the initial cost by tip percentage and rounds it to the nearest hundredths place
        // I learned how to round to 2 decimal places from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalCost = cost + tipAmount; // total bill including tip; adds the tip amount + initial cost to get total cost
        double costPerPersonBeforeTip = Math.round((cost / people) * 100) / 100.0; // how much each person pays before tip; divides initial cost by number of people and rounds to the nearest hundredths place
        double tipPerPerson = Math.round((tipAmount / people) * 100) / 100.0; // how much each person has to tip; divides tip amount by number of people and rounds to the nearest hundredths
        double totalCostPerPerson = Math.round(((cost + (cost * (percent * 0.01))) / people) * 100) / 100.0; // how much each person has to pay for the total bill including tips; adds initial cost + tip amount and rounds to the nearest hundredths
                        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tipAmount + "\n");
        result.append("Total Bill with tip: " + "$" + totalCost + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPersonBeforeTip + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");
        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        System.out.println("What items on the menu did you order? (enter -1 when you are done)");
        String customerOrder = "a";
        // I learned how to compare two strings together from here: https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
        while (!customerOrder.equals("-1")) {
            customerOrder = scan.nextLine();
            if (customerOrder.equals("-1")) {
                scan.close();
            } else {
                items = items + customerOrder + "\n";
            }

        }
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
