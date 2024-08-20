package module1;

public class Arraysort 
{
	public static void main(String[] args)
	{
	  int[] a=new int[] {23,34,55,13,35,46,66};
	
	   for(int x=0;x<=a.length-2;x++)
	   {
		  for(int y=x+1;y<=a.length-1;y++)
		    {
			  if(a[x]>a[y])
			   {
				int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
			    }
			  
			}
		  
	    }
	   for(int temp:a)
			  System.out.println(temp);
    }
}
