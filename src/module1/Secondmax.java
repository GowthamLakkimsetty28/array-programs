package module1;
import java.util.*;

public class Secondmax 
{
	    public static void main(String[] args)
	    {
	        int[] array = {12,35,1,10,34,1};
	             Arrays.sort(array);
	             for(int y:array) {
	            	 System.out.println(y); 
	             }
	            
	            int firstMax = Integer.MIN_VALUE;
	            int secondMax = Integer.MIN_VALUE;

	            for (int num : array) 
	            {
	                if (num > firstMax) 
	                {
	                    secondMax = firstMax;
	                    firstMax = num;
	                } 
	                else if (num > secondMax && num != firstMax) 
	                {
	                    secondMax = num;
	                }
	            }
	                System.out.println("The second maximum value is: " + secondMax);
	    }
}



