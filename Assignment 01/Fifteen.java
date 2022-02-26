import java.util.*;
public class Fifteen
{
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int reverse = 0;
         int remainder;
         while(number!=0)
         {
             remainder = number % 10;
             reverse = (reverse*10)+remainder;
             number=number/10;
         }
         System.out.println("The reverse of the given number is "+reverse );       
	}
}
