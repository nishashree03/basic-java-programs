package java_programs20;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD is: " + a);
    }
}