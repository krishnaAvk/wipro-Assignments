import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract String m1();
	abstract int m2();
	abstract boolean m3();
	A(String k)
	{
		System.out.print(k);
	}
}
class B extends A
{
	String m1()
	{
		System.out.println("m1 meeted b");
		return "hi";
	}
	int m2()
	{
		System.out.println("m1 meeted b");
		return 100;
	}
	boolean m3()
	{
		System.out.println("m1 meeted b");
		return false;
	}
	B()
	{
		super(sc.next("venkata krishna"));
	}
}	
class C extends A
{
	String m1()
	{
		System.out.println("m1 meeted c");
		return "hi";
	}
	int m2()
	{
		System.out.println("m1 meeted c");
		return 100;
	}
	boolean m3()
	{
		System.out.println("m1 meeted c");
		return false;
	}
	C()
	{
		super(sc.next("manoj"));
	}
	
}
class D extends A
{
	String m1()
	{
		System.out.println("m1 meeted D");
		return "hi";
	}
	int m2()
	{
		System.out.println("m1 meeted D");
		return 100;
	}
	boolean m3()
	{
		System.out.println("m1 meeted D");
		return false;
	}
	D()
	{
		super(sc.next("ravindra"));
	}
}
class test
{
	char display(A obj)
	{
		System.out.println(obj.m1());
		System.out.println(obj.m2());
		System.out.println(obj.m3());
		return 'S';
	}	
	public static void main(String[]args)
{	
	test obj=new test();
	int k=A.sc.nextInt();
	switch(k)
	{
		case 1:
			System.out.println(obj.display(new B()));
			break;
		case 2:
			System.out.println(obj.display(new C()));
			break;
		case 3:
			System.out.println(obj.display(new D()));
			break;
	}
  }
}
