package module1;

public class Secondmin 
{
	    public static void main(String[] args) 
	    {
	        int[] array = {12, 35, 1, 10, 34, 1};

	      
	            int firstMin = Integer.MAX_VALUE;
	            int secondMin = Integer.MAX_VALUE;

	            for (int num : array) 
	            {
	                if (num < firstMin) 
	                {
	                    secondMin = firstMin;
	                    firstMin = num;
	                } 
	                else if (num < secondMin && num != firstMin)
	                {
	                    secondMin = num;
	                }
	            }
	                System.out.println("The second minimum value is: " + secondMin);
	     }
}




