package org.javalab.scanner;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("name: " + name);

        System.out.println("Enter gender (M/F)");
        char firstChar = sc.next().charAt(0);
        System.out.println("firstChar: " + firstChar);

        System.out.println("Enter mobile number without country and state code");
        long mobileNumber = sc.nextLong();
        System.out.println("Mobile number: " + mobileNumber);

        System.out.println("Enter gold price");
        double goldPrice = sc.nextDouble();
        System.out.println("Gold price" + goldPrice);
    }
}
