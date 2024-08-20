package module1;
import java.util.Scanner;

public class binary
{
	public static void main(String[] args) 
	{
	 Scanner s = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int number = s.nextInt();
	        int[] binary = new int[32]; 
	        int index = 0;
	            while (number > 0) 
	            {
	                binary[index++] = number % 2;
	                number = number / 2;
	            }
	            System.out.print("Binary value: ");
	            for (int i = index - 1; i >= 0; i--)
	            {
	                System.out.print(binary[i]);
	            }
	}
}
