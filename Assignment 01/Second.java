import java.util.*;
public class Second
{
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int factno = sc.nextInt();
         int answer=1;
         for(int i = 1;i<=factno;i++)
         {
             answer=answer*i;
         }
         System.out.println("The factorial of a given number is "+answer);
	}
}
