package module1;

public class Arrhalfrev
{
	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50,60};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		int d[]=new int[a.length];
		
		for(int x=0;x<a.length/2;x++)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");
		}
		System.out.println();
		for(int x=a.length/2,y=0;x<a.length;x++,y++)                                                                                       
		{
			c[y]=a[x];
			System.out.print(c[y]+" ");
			
		}
		System.out.println();
		for (int x = 0; x < c.length; x++) 
		{
            d[x] = c[x];
        }
        for (int x = 0; x < b.length; x++)
        {
            d[c.length + x] = b[x];
        }
        for (int x = 0; x < d.length; x++)
        {
            System.out.print(d[x] + " ");
        }
        System.out.println();			
	}

}
