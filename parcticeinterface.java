import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float f);
	default String m2(boolean b)
	{
		System.out.print(b);
		return "krishna";
	}
	abstract class A
	{
		abstract char m3(String k);
		long m4(double d)
		{
			System.out.print(d); 
			return sc.nextLong();
		}
	}
}
class concert implements I1

{
	public int m1(float f)
	{
		System.out.print(f);
		return sc.nextInt();
	}
	public char m3(String k)
	{
		System.out.print(k);
		return sc.next().charAt(0);
	}


	public static void main(String[]args)
	{
		I1 obj=new concert();
		System.out.print(obj.m1(I1.sc.nextFloat()));
		System.out.print(obj.m2(I1.sc.nextBoolean()));
		I1.A obj1=new concert();
		System.out.print(obj1.m3(I1.sc.next()));
		System.out.print(obj1.m4(I1.sc.nextDouble()));
     }
}