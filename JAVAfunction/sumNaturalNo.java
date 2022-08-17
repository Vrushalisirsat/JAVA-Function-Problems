// Q. WAP to print sum of first n natural no.

import java.util.*;
class sumNaturalNo
{

   public static void printSum(int n)
   {
    int sum=0;
     for(int i=1;i<=n;i++)
     {
        sum=sum+i;
     }
     System.out.println("Sum of first n Natural No. is = " + sum);
   }

    public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a numbers :");
   int n = sc.nextInt();
   printSum(n);
}
}