package module1;

public class Array
{
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 5};

        System.out.println("Even elements at odd indices:");
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] % 2 == 0) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        }
    }
}

