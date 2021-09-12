/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;

public class Mad_lib {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String noun, verb, adjective, adverb;
        System.out.println("Enter a noun:");
        noun = sc.nextLine(); // accepting input 
        System.out.println("Enter a verb:");
        verb = sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective = sc.nextLine();
        System.out.println("Enter an adverb:");
        adverb = sc.nextLine();
        // Building final output using string format. 
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));
    }
}
