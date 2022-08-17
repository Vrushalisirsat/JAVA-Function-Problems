import java.util.*;

class Multiply
{

 public static int Factorial(int n)
 {
   for(int i=1;i<=n;i++)
   {
     fact=fact*i;
   }

   return fact;

 }



 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter 2 numbers :");
   int n = sc.nextInt();
  int fact=1;
   
System.out.print("Factorial of Number is " + Factorial(n));

}
}