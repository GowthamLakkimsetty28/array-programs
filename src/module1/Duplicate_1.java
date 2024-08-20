package module1;
import java.util.Arrays;

public class Duplicate_1
{
 public static void main(String[] args) 
  {
    int[] arr = {1, 2, 3, 2, 3, 4, 5};
    System.out.println(sumOfDuplicates(arr));
  }
  public static int sumOfDuplicates(int[] arr) 
  {
    Arrays.sort(arr);
    int duplicateSum = 0;
    boolean hasDuplicates = false;
     for (int i = 0; i < arr.length - 1; i++)
     {
	   if (arr[i] == arr[i+1]) 
	   {
		 hasDuplicates = true;
		 duplicateSum += arr[i];
         while (i < arr.length - 1 && arr[i] == arr[i + 1])
         {
		  i++;
	     }
       }
    }
   return hasDuplicates ? duplicateSum : -1;
  }
}
