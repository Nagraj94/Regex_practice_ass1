package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice{

    static Scanner sc = new Scanner(System.in);
    static Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
    static Pattern email = Pattern.compile( "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
    static Pattern phNo = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
    static Pattern passWord = Pattern.compile("[a-z]{8,}");

    public static void main(String[] args) {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        System.out.println("eg.abc.xyz@bl.co.in\nEnter email: ");
        String emailValid = sc.next();
        System.out.println("Enter phone number");
        String phNoValid = sc.next();
        System.out.println("Enter password: ");
        String passValid = sc.next();

        Matcher matchFirstName = name.matcher(firstName);
        Matcher matchLastName = name.matcher(lastName);
        if (matchFirstName.matches() && matchLastName.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("first letter should start with capital");
        }
        Matcher matchEmail = email.matcher(emailValid);
        if (matchEmail.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("enter valid email eg.eg.abc.xyz@bl.co.in");
        }
        Matcher matchNum = phNo.matcher(phNoValid);
        if (matchNum.matches()){
            System.out.println("phone number is valid");
        }
        else {
            System.out.println("enter valid phone number");
        }
        Matcher matchPassword = passWord.matcher(passValid);
        if (matchPassword.matches()){
            System.out.println("password is valid ");
        }
        else {
            System.out.println("password is invalid");
        }
    }
}
