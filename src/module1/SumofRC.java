package module1;

public class SumofRC 
{
 public static void main(String[] args)
   {
      int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int rows = matrix.length;
		        int cols = matrix[0].length;
		        
		        int[] rowSums = new int[rows];
		        int[] colSums = new int[cols];
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                rowSums[i] += matrix[i][j];
		                colSums[j] += matrix[i][j];
		            }
		        }
		        System.out.println("Sum of each row:");
		        for (int i = 0; i < rows; i++) {
		            System.out.print(rowSums[i] + " ");
		        }
		        System.out.println();
		        System.out.println("Sum of each column:");
		        for (int j = 0; j < cols; j++) {
		            System.out.print(colSums[j] + " ");
		        }
		        System.out.println();
		    }
		}
