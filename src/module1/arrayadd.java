package module1;

public class arrayadd 
{
 public static void main(String[] args)
 {
	        int[] arr = {1, 2, 3, 4, 5};

	        int n = arr.length;//5
	        int result[] = new int[n];

	        for (int i = 0; i < n; i++) 
	        {
	            int prev = (i > 0) ? arr[i - 1] : 0;
	            int next = (i < n - 1) ? arr[i + 1] : 0;
	            result[i] = prev + next;
	        }
	        if (n > 1) 
	        {
	            result[0] += arr[0];
	            result[n - 1] += arr[n - 1];
	        }
	        System.out.print("Array: ");
	        for (int num : result) 
	        {
	            System.out.print(num + " ");
	        }
	    }
	}


