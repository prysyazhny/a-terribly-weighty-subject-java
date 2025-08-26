package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Converter converter = new Converter();
    System.out.println("\nWelcome to the Ounce Conversion Program!\n");

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many ounces do you have?");
    int ounces = scanner.nextInt();
    System.out.println("Thank you! Converting ounces to pounds.\n");
    System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
    System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".");
    System.out.println("\nThank you for using the OCP!\n");
    scanner.close();
  }
}
