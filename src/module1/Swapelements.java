package module1;

public class Swapelements 
{
  public static void main(String[] args)
  {
	  int[] a=new int[] {10,20,30,40,50,60};
	   int temp;
	   temp=a[0];
	   a[0]=a[1];
	   a[1]=temp;
	   
	   temp=a[2];
	   a[2]=a[3];
	   a[3]=temp;
	   
	   temp=a[4];
	   a[4]=a[5];
	   a[5]=temp;
	   
	   for(int var:a)
	 System.out.println(var);
  }
}

