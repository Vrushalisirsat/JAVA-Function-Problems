import java.util.*;

class Factorial
{

 public static void printFactorial(int n)
 {
   if(n<0)
   {
    System.out.print("Invalid Input");
    return;
   }


   int fact=1;
   for(int i=1;i<=n;i++)
   {
     fact=fact*i;
   }

    
  System.out.print("Factorial of Number is " + fact);

 }



 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter 2 numbers :");
   int n = sc.nextInt();
  
   printFactorial(n);

}
}