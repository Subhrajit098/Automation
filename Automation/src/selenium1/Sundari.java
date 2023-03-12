package selenium1;

public class Sundari 
{
	String name;
	int age;
	public static void main(String[] args) 
	{
	Sundari s= new Sundari("katrina", 0);
	
	Sundari s1=new Sundari(10);
	
	String m=	s.man("karina", 28);
	
	String n=s1.man("alia", 25);

	System.out.println(m);
	
	System.out.println(n);
	
	}
public String man(String name,int age) 
{
	System.out.println(age); 
	return name;
}
Sundari(String name,int age)

{
	this.name=name;
	System.out.println("constructor 1 is " +name);
}
Sundari(int age)
{
	this.age=age;
	System.out.println("constructor 2  "); 
}
}
