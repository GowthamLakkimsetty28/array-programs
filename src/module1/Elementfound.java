package module1;

public class Elementfound 
{ 
	public static void main(String[] args)
	{
		int[] a=new int[] {15,7,9,14,11,12,13,8,11,11};
		int freq=0,index=0,element=11,indexat=0,lastat=0;
		for(int temp:a)
		{
			index++;
			if(temp==element)
			{
				freq++;
				lastat=index;
				
			}
			if(temp==element&&indexat<1)
			{
				indexat=index;
				
			}
			
		}
		System.out.println("Element found at " +indexat);
		System.out.println(freq+"times");
		System.out.println("element last found at index "+lastat);
	}
}
			
