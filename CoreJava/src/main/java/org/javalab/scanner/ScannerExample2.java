package org.javalab.scanner;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        System.out.println("Total input sum: " + sum);
        System.out.println("Total input count: " + count);
    }
}
