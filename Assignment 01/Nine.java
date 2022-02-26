import java.util.*;
public class Nine
{
    static void recursion(int n)
    {
        if(n<=10)
        {
            System.out.println(n);
            recursion(n+1);
        }
        
    }
	public static void main(String[] args) {
	    recursion(1);
	}
}