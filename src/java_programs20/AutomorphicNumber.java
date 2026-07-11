package java_programs20;
import java.util.*;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int square = n * n;

        if(String.valueOf(square).endsWith(String.valueOf(n)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}
