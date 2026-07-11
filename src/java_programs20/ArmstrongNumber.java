package java_programs20;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        int sum = 0;

        while(temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;

        while(temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}