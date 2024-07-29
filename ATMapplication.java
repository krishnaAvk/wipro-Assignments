import java.util.Scanner;
interface I1
{
	static Scanner sc=new scanner(System.in);
	abstract void balance_check();
}
interface I2
{
	abstract void width_draw();
}
interface I3
{
	abstract void deposite();
}
class Z extends I1,I2,I3
{
	static Scanner sc=new Scanner(System.in);
	String name="krishna";
	long accno=6301778911;
	long phno=9573357082;
	int atm_pin=5068;
}
System.out.println("Enter Atmtheater");
System.out.println("welcome press 1 for hyderbad \n press 2 for vizag \n press 3 for kanaigiri \n press 4 for ongole");
int k=sc.nextInt();
switch(k):
{
	case:'1'
		{
			System.out.print("welcome to hyderbad press 1 for kphb \n press 2 for ammerpet \n press 3 for balanagar \n press 4 for jntu);
		break;
		}
	case:'2'
		{
			System.out.print("welcome to vizag \n press 1 for new city \n press2 for old city \n press 3 for sitamdhara \n press 4 for madhuravada);
		break;
		}
	case:'3'
		{
			System.out.print("welcome to kanigiri \n press 1 for agraharam \n press 2 for veligandla \n press 3 for moguluru \n press 4 for msrstreet");
		break;
		}
		case:'4'
		{
			System.out.print("welcomr to ongole \n press 1 for kurnoolroad \n press 2 for kanigiriroad \n press 3 for busstand \n press 4 for podili");
		break;
		}
		default:
		System.out.print("invalid number has choosen");
}
System.out.print("welcome to atmhall");

	