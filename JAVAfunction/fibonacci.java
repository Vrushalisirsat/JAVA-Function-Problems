// Q. WAP to print fibonacci series of n terms where n is input by user.

import java.util.*;
class fibonacci{

   public static void printFibonacciNo(int n)
   {
    int a=0;
    int b=1;

   
    for(int i=1;i<=n;i++)
    {
        System.out.print(a + " ");
        int fib=a+b;
        a=b;
        b=fib;
    }
   }


     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
 
        printFibonacciNo(n);
    }
}