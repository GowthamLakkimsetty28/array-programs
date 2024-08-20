package module1;

public class MostRepeated 
{
   public static void main(String[] args) 
   {
	int[] arr = {11, 11, 11, 2, 3, 4, 5, 5, 5, 16,16,16, 7, 8, 9}; 
    int mostFrequent = arr[0];
	int maxCount = 0;
       for (int i = 0; i < arr.length; i++)
        {
	      int count = 0;
	        for (int j = 0; j < arr.length; j++) 
	         {
	           if (arr[i] == arr[j]) 
	           {
	               count++;
	           }
	         }
	         if (count > maxCount) 
	          {
	           maxCount = count;
	           mostFrequent = arr[i];
	          }
	    }
        System.out.println("The most frequent element is: " + mostFrequent + " appeared " + maxCount + " times");
    }
}
