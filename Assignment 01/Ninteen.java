import java.util.*;
public class Nineteen
{
	public static void main(String[] args) {
	       System.out.println("Enter the number you wish to check whether it is palindrome or not");
     Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int sum=0;
	 int rem = n;
	 while(n>0)
	 {
	     sum = (sum *10)+ n%10;
	     n = n/10;
	     
	 }
	 if(rem==sum)
	 System.out.println("palindrome");
	 else
	 System.out.println("not- palindrome");

	}
}