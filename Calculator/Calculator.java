import java.util.*;
import java.io.*;
public class Calculator
{   
    public static void main()
    {
        System.out.println("-------Calculator-------");
        Scanner sc=new Scanner(System.in);
        char z;
        do
        {
            System.out.println("Enter First operand:");
            double x=sc.nextDouble();
           
            System.out.println("Enter Second operand:");
            double y=sc.nextDouble();
            
            System.out.println("Enter operator(+,-,*,/):");
            z=sc.next().charAt(0);
            
            System.out.printf("%f %c %f =",x,z,y);
            
            if(z=='+')System.out.println(add(x,y));
            else if(z=='-')System.out.println(sub(x,y));
            else if(z=='*')System.out.println(mul(x,y));
            else if(z=='/')System.out.println(div(x,y));
            else System.out.println("Error unsupported Operator");
            System.out.println("Press A to continue:");
            z=sc.next().charAt(0);
        }while(z=='A');
    }
    static double add(double x,double y)
    {
        return(x+y);
    }
    static double sub(double x,double y)
    {
        return(x-y);
    }
    static double mul(double x,double y)
    {
        return(x*y);
    }
    static double div(double x,double y)
    {
        return(x/y);
    }
}
    