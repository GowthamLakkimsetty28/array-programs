package module1;

public class Copyarray
{
	public static void main(String[] args)
	{
	int a[]=new int[] {1,2,3,4,5};
	int b[]=new int[a.length];
	
	for(int x=0;x<=a.length-1;x++)
	{
		b[x]=a[x];
	}
	for(int x=0,y=a.length-1;x<=a.length-1;x++,y--)
	{
	  b[x]=a[y];
	}
	for(int x=0;x<a.length;x++)
		System.out.print(b[x]+" ");
	
	}
	
}
