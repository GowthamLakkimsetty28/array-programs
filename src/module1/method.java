package module1;

public class method 
{
  public static void main (String[] args)
  {
	  Abc obj = new Abc();
	  String s=obj.palindrome();
	 System.out.println(s);
	 
  }
  
}
class Abc
{
	int num=124,temp=num;
	int reverse()
	{
		int rev=0;
		for(;temp>0;)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;

		}
		return rev;
		
	}

	String palindrome()
	{
		int value=reverse();
		if(value==num)
			return "palindrome";
		else
			return "not palindrome";
		
	}
}

