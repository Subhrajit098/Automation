package selenium1;

public class Multiply 
{

	
public static void main(String[] args) 
{
 Multiply M= new Multiply( );
 
 int num=M.multi(201,30);
 
 System.out.println( " multiplicatin of the two no is "+num);
 
 System.out.println("the sum two no is "+M.sum(30,20));
}
   public int multi(int a,int b) 
   {
	
	int c=a*b;
    return c;
   }
   public int sum(int a,int b )
   {
	   
	   int c=a+b;
	   return c;
   }
}
