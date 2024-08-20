package module1;

public class NTwoDarray 
{
  public static void main(String[] args) 
    {
	  int[]a[]=new int[][] {
          {1,2,3},
          {4,5,6},
          {7,8,9}
         };
int r=3,c=3;
int j;            
int i;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();

}

	}

}
