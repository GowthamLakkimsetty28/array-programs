package module1;
import java.util.Arrays;

public class SelectionSort 
{
  public static void main(String[] args) 
	{
	  int a []=new int[] {11,24,45,56,45,65,77,23};
	  Arrays.sort(a);
	  int x;
	  for(x=0;x<a.length-1;x++);
			  {
				 int min=x;
				 for(int y=x+1;y<a.length;y++)
				 {
					if(a[min]>a[y])
					{
						min=y;
					}
				 }
				 int t=a[min];
				 a[min]=a[x];
				 a[x]=t;
			  }
			  for(int t:a)
			  {
				  System.out.print(t+" ");
			  }

	}

}
