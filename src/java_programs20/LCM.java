package java_programs20;
import java.util.*;
public class LCM {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        int max = (a > b) ? a : b;

	        while(true) {
	            if(max % a == 0 && max % b == 0) {
	                break;
	            }
	            max++;
	        }

	        System.out.println("LCM is: " + max);
	    }
	
}
