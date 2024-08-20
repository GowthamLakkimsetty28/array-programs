package module1;

public class SumOfNaturalNumbers 
{
	public static void main(String[] args) 
	{
	        int n = 10;
	        int sum = sumOfNumbers(1, n);
	        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
	}

	    
	    public static int sumOfNumbers(int start, int end) {
	        if (start > end) {
	            return 0;
	        } else {
	            return start + sumOfNumbers(start + 1, end);
	        }
	    }
	}


