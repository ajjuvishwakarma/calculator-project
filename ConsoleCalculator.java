import java.util.Scanner;

public class ConsoleCalculator 
{
 // Method for addition
 public static double add(double a,double b)
 {
    return a+b;
 }
    // Method for subtraction
    public static double subtract(double a, double b)
    {
         return a-b;
    }
        
    
    //Method for Multiplication
    public static double multiply(double a,double b)
    {
        return a*b;
    }

    // Method for division
    public static double divide(double a,double b)
    {
        if(b==0)
        {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        else
        {
         return a/b;
        }
    }
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n ====Java Console Calculator====");
            System.out.println("1. Addition(+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division(/)");
            System.out.println("5.Exit");
            choice=scanner.nextInt();
            if(choice>=1&&choice<=4)
            {
                System.out.println("Enter first number:");
                double num1=scanner.nextDouble();
                System.out.println("Enter second number:");
                double num2=scanner.nextDouble();
                double result=0;
                
                //switch case
                switch(choice)
                {
                    case 1:
                    result= add(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                    case 2:
                    result= subtract(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                    case 3:
                    result=multiply(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                    case 4:
                    result=divide(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                }
            }
            else if(choice==5)
            {
                System.out.println("Exiting calculator. Thanks for visit");
            }
         else
         {
            System.out.println("Invalid choice. Please enter 1 to 5.");
         }   
    }
    while(choice!=5);
    scanner.close();
}
}
