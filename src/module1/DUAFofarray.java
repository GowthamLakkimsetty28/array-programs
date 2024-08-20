package module1;

import java.util.Arrays;

public class DUAFofarray 
{
 public static void main(String[] args) 
    {
	 int a[]=new int[] {11,32,43,56,57,56,34,45};
	 Arrays.sort(a);
	 boolean b[]=new boolean[a.length];
	 int count=1;
	 for(int x=0;x<b.length;x++)
	 {
		 count=1;
		 if(b[x]==true)
	     continue;
		 for(int y=x+1;y<b.length;y++)
		 {
			if(a[x]==a[y])
			{
				count++;
				b[y]=true;
			}
		 }
		 if(count>1)
			 System.out.println(a[x]+" "+count);

	 }

	}

}
