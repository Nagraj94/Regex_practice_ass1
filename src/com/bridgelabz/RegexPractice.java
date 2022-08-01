package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice{

    static Scanner sc = new Scanner(System.in);
    static Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
    static Pattern email = Pattern.compile("^[a-z+.]+@(.+)$");

    public static void main(String[] args) {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        System.out.println("eg.abc.xyz@bl.co.in\nEnter email: ");
        String emailValid = sc.next();

        Matcher matchFirstName = name.matcher(firstName);
        Matcher matchLastName = name.matcher(lastName);
        if (matchFirstName.matches() && matchLastName.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("first letter should start with capital");
        }
        Matcher matchEmail = email.matcher(emailValid);
        if (matchEmail.matches()){
            System.out.println("email is valid");
        }
        else {
            System.out.println("enter valid email eg.eg.abc.xyz@bl.co.in");
        }

    }
}
