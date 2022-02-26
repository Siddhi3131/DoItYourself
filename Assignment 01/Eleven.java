import java.util.*;
public class Eleven
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of which you want factors:");
	    int number = sc.nextInt();
	     System.out.print("The factors of a "+number+" are: ");
	    for(int i=1;i<=number;i++)
	    {
	        if(number%i==0)
	        System.out.print(i+" ");
	    }
	}
}