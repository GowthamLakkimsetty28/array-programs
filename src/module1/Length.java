package module1;

public class Length 
{
    public static void main(String[] args) 
    {
        int[] myArray = {1,2,3,4,5,6,7,8};
        int length = getArrayLength(myArray);
        System.out.println("The length of the array is: " + length);
    }
 public static int getArrayLength(int[] arr)
     {
        int count = 0;
        for (int element : arr) 
        {
            count++;
        }
        return count;
     }
}

