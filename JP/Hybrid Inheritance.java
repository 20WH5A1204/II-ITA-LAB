class Base  
{
	int a = 10;
}
class Child extends Base  
{
	int b = 20;
	void sum()
	{
		System.out.println("Sum of a and b is : " +(a + b));
	}
}

class ChildChild extends Child
{
	int c = 5;
	void mul()
	{
		System.out.println("Multiplication of a and c is : " +(a * c));
	}
}
class D extends Child
{
	int d;
	void add()	
	{
		d = a + b;
		System.out.println("Sum of a and b is : " +d);
	}
}
class Main
{
public static void main(String[] args)
{
		D obj = new D();
		obj.add();
		
}
}