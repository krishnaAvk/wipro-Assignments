import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	static int m1(float f)
	{
		System.out.print(f);
		return sc.nextInt();
	}
	A(int i)
	{
		System.out.print(i);
	}
	abstract boolean m2(String s);
	
}
class b extends A
{
	b()
	{
		super(sc.nextInt());
	}
	 boolean m2(String s)
	{
		System.out.print(s);
		return A.sc.nextBoolean();
	}
	
}
class test
{
	public static void main(String[]args)
	{
		b obj1 =new b();
		 System.out.print(obj1.m2(A.sc.next()));
		System.out.print(A.m1(A.sc.nextFloat()));
	}
}