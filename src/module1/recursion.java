package module1;

public class recursion
{
  public static void main(String[] args)
   {
	  int n=10;
	 int sum = sumOfNumbers(n);
	 System.out.println("Sum of first " + n + " natural numbers is: " + sum);
   }

	   
	public static int sumOfNumbers(int n) 
	{
	  if (n == 1)
	   {
	    return 1; 
	   } 
	  else 
	  {
	   return n + sumOfNumbers(n - 1);
	  }
	}
}
