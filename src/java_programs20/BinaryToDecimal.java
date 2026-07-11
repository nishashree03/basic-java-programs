package java_programs20;

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int n = sc.nextInt();

        int decimal = 0;
        int base = 1;

        while(n > 0) {
            int digit = n % 10;
            decimal = decimal + digit * base;
            base = base * 2;
            n = n / 10;
        }

        System.out.println("Decimal value is: " + decimal);
    }
}