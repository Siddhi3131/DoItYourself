import java.util.*;
public class Fourteen
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
     while(n2>0)
     {
         n1++;
         n2--;
     }
     System.out.println(n1);
   }
}