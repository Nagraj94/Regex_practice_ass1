package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice{

    static Scanner sc = new Scanner(System.in);
    static Pattern str = Pattern.compile("^[A-Z]\\w{3,}$");

    public static void main(String[] args) {
        System.out.println("Enter first name: ");
        String firstName = sc.next();

        Matcher match = str.matcher(firstName);
        if (match.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("first letter should start with capital");
        }

    }
}
