package module1;
import java.util.Scanner;

public class nestedloop 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
          int factors = 0;
          for (int i = 1; i <=num1; i++) 
          {
            if (num1 % i == 0) 
            {
             factors++;
              break;
            }
          }
           if (factors == 2)
           {
            System.out.println(num1+ " is a prime number.");
           }
           else 
           {
           System.out.println(num1 + " is not a prime number.");
           }
          int factor = 0;
          for (int i = 1;i <=num2; i++) 
          {
            if (num2 % i == 0) 
            {
             factor++;
              break;
            }
          }
           if (factor ==2)
           {
            System.out.println(num2+ " is a prime number.");
           }
           else 
           {
            System.out.println(num2 + " is not a prime number.");
           }
       
        if(num1-num2==2) {
            System.out.println(num1 + " and " + num2 + " are twin primes.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin primes.");
        }

    }
}
