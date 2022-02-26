import java.util.*;
public class Ten
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    int number = sc.nextInt();
        int remainder;
        int sum = 0;
        while(number>0){
            remainder = number % 10;
            System.out.println(remainder);
            number = number/10;
        }
        
	}
}