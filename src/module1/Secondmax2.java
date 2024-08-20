package module1;
import java.util.Arrays;

public class Secondmax2 
{
 public static void main(String[] args)
   {
	 int a[]=new int[] {11,32,43,56,57,56,34,45};
	 Arrays.sort(a);
	 for(int x=a.length-2;x>0;x--)
	 {
		 if(a[a.length-1]!=a[x])
		 {
			 System.out.println(a[x]);
			 break;
		 }
	 }
  }

}
