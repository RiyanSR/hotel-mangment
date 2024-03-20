//write a java program to illustraw diffrent types of constructor
//bank class

class Bank
{
	int ano;
	float bal;
	String cname;
//Default constructor
     Bank()
	{
		ano=1234;
		bal=10000;
		cname="RAM";
	}
//Parameterized constrctor
    Bank(int x,float y,String z)
	{
		ano=x;
		bal=y;
		cname=z;
	}
	void display()
{
System.out.println("Account no="+ano);
System.out.println("Account name="+cname);
System.out.println("balance="+bal);
}
}
//Main class
class Bankdemo
{
	public static void main(String[]args)
	
	{
		System.out.println("Default Constructor");
		Bank b= new Bank();
		b.display();
	
		System.out.println("Paramterized Constructor");
		Bank b1 = new Bank(254,52000,"Amar");
		b1.display();
	}
}