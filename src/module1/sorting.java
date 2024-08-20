package module1;
public class sorting 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {
                temp[count++] = arr[i];
            }
        }
        while (count < n)
        {
            temp[count++] = 0;
        }
        for (int i = 0; i < n; i++)
        {
            arr[i] = temp[i];
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

