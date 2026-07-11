package java_programs20;

import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while(n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        if(temp % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}