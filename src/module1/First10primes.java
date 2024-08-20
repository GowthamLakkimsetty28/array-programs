package module1;

public class First10primes
{
  public static void main(String[] args) 
  {
    int count = 0;
	int number = 2; 
    while (count < 10)
	{
	 int divisorCount = 0;
	 for (int i = 2; i <= number / 2; i++) 
	  {
	    if (number % i == 0) 
	    {
	      divisorCount++;
	       break; 
	    }
	  }
	  if (divisorCount == 0) 
	   {
	    System.out.println(number);
	    count++;
	   }
	    number++;
	 }
	    
	}

}
