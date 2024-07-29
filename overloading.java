import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(float f)
	{
		System.out.print(f);
		return sc.nextInt();
	}
	boolean m2(String s)
	{
		System.out.print(s);
		return sc.nextBoolean();
	}
	 float m3(char c)
	{
		System.out.print(c);
		return sc.nextFloat();
	}
}
class b extends A
{
	int m1(float f)
	{
		int x=super.m1(A.sc.nextFloat());
		return x;
	}
	 boolean m2(String s)
	{
		boolean y=super.m2(A.sc.next());
		return y;
	}
	  float m3(char c)
	{
		float z=super.m3(A.sc.next().charAt(0));
		return z;
	}
}
class test
{
	public static void main(String[]args)
	{
		b obj1 =new b();
		 System.out.print(obj1.m1(A.sc.nextFloat()));
		System.out.print(obj1.m2(A.sc.next()));
		System.out.print(obj1.m3(A.sc.next().charAt(0)));		
	}
}