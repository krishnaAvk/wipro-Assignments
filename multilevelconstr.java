import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{		
		System.out.println("default");
	}
}
class b extends A
{
	b(int b)
	{
		super();
		System.out.println(b);
	}
}
class c extends b
{
	c(float f,String s)
	{
		super(A.sc.nextInt());
		System.out.println(f+" "+s);
	}
}
class e extends c
{
	e(boolean b)
	{	
		super(A.sc.nextFloat(),A.sc.next());	
		System.out.println(b);
	}
}

class test
{
	public static void main(String[]args)
	{
		e obj=new e(A.sc.nextBoolean());
}
}