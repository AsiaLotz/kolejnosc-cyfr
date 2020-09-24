package com.company;
import java.util.Scanner;
public class ptw {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj trzy cyfry: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        System.out.println("Kolejność liczb to: "
                + a + " " + b + " " + c);
    }
}
