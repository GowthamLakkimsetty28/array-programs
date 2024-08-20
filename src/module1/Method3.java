package module1;

public class Method3
{
  public static void main(String[] args)
  {
	  Noreturn student=new Noreturn();
	  student.m1(135);
  }
 
}
class Noreturn
{
	void m1(int n)
	{
		int rem=0,rev=0;
		for(;n>0;)
		{
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		}
		System.out.println(rev);
	}
	
}