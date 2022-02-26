import java.util.*;
public class Third
{
    static int fact(int x)
    {
        if(x>1)
        {
        return  x * fact(x-1);
        }
        else
        {
            return 1;
        }
    }
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         
         System.out.println("The factorial of a given number is "+fact(x));
	}
}