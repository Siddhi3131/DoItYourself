import java.util.*;
class Eight{
   public static void main(String args[])
   {
 	       System.out.println("Enter the year");
     Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 if((n%4==0 &&  n%100!=0) || n%400==0)
	 {
	   System.out.println("The year "+n+" is a leap year");
	 }
	 else{
	   System.out.println("The year "+n+" is not a leap year");
	 }
		System.out.println("Hello World");
	}
	 
   }
}