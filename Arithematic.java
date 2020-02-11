import java.util.Scanner;
class Arithematic
{
   public  int add(int a,int b)
    {
  	return a+b;
    }
    public  int substraction(int a,int b)
    {
       return a-b;
    }
    public  int multiplication(int a,int b)
    {
       return a*b;
    }
    public  float division(int a,int b)
    {
        return a/b;
    }
    public  int modulo_division(int a,int b)
    {
       return a%b;
     }
}
class Arithematic_operation
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       Arithematic d=new Arithematic();

       System.out.println(d.add(a,b));
       System.out.println(d.substraction(a,b));
       System.out.println(d.multiplication(a,b));
       System.out.println(d.division(a,b));
       System.out.println(d.modulo_division(a,b));
    }
}