package module1;

public class SumDivide 
{
	public static void main(String[] args) 
	{
	  int[] inputArray = {1, 2, 3, 4, 5};
	  int[] outputArray = new int[inputArray.length];
	  int totalSum = 0;
	  for (int i = 0; i < inputArray.length; i++)
	    {
	     totalSum += inputArray[i];
	    }
	     for (int i = 0; i < inputArray.length; i++) 
	        {
	            outputArray[i] = totalSum / inputArray[i];
	        }
	        System.out.print("Output array: ");
	         for (int i = 0; i < outputArray.length; i++) 
	         {
	            System.out.print(outputArray[i] + " ");
	         }
	}
}
