package module1;

public class recursion2
{
	public static void main(String[] args)
	{
	   User user=new User();
	   System.out.println(user.m1(10));
	}
public static class User
{
	int m1(int n)
	{
		if(n==0)
			return 0;
		else
			return n+m1(n-1);
	}
}

}
