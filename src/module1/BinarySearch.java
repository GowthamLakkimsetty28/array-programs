package module1;

public class BinarySearch
{
  public static void main(String[] args) 
  {
	int[] a=new int[] {10,20,30,40,50,60,70};
	int first=0,last=a.length-1,search=70;
	int mid,iterate=0;
	while(first<=last)
	{
		mid=(first+last)/2;
	    if(a[mid]<search)
        {
	      first=mid+1;
        }
        else if(a[mid]==search)
        {
          System.out.println("element found at "+(mid+1));
          break;
        }
        else {
         last=mid-1;
        }
        iterate++;
	}
	if(first>last)
	{
		System.out.println("element not found");
	}
	System.out.println(iterate+" iterations");
  }

}
