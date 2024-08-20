package module1;

public class rtwp
{
 public static void main(String[] args) 
 {
  printEvenNumbers(1, 20);
  System.out.println();
 }
public static void printEvenNumbers(int start, int end)
{
  for (int num = start; num <= end; num++)
  {
   if (num % 2 == 0)
   {
    System.out.print(num + " ");
   }
   
  }
}

}
