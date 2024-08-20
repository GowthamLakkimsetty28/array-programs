package module1;

public class Kvalue 
{
 public static void main(String[] args)
  {
	int[] array = {10, 20, 30, 40, 50};
	int k = 20;
	for (int i = 0; i < array.length; i++) 
	{
	    for (int j = i + 1; j < array.length; j++) 
	    {
	         if (array[i] + array[j] == k)
	         {
	          System.out.println("Pair found: (" + array[i] + ", " + array[j] + ")");
	         }
       	}
     }
   }
}


