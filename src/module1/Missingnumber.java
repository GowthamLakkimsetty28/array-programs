package module1;

public class Missingnumber 
{
  public static void main(String[] args) 
  {
	int[] arr = {21, 22, 23, 24, 25, 26, 27, 28, 30};
    int missingNumber = findMissingNumber(arr, 21, 30);
    System.out.println("The missing number is: " + missingNumber);
  }
   public static int findMissingNumber(int[] arr, int start, int end) 
      {
		int n = end - start + 1;
		int totalSum = (n * (start + end)) / 2;
		int arrSum = 0;
		for (int num : arr) 
		   {
		    arrSum += num;
		   }
		    return totalSum - arrSum;
      } 
}
