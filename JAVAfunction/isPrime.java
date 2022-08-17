//Q.Make a function to check a number is prime or not.

import java.util.*;
class isPrime
{
 public static void primeNo(int n)
 {
    int counter=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            counter++;
        }
    }

    if(counter == 2)
    {
        System.out.print("Prime Number");
    }
    else
    {
         System.out.print("Not a Prime Number");
    }
 }


 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a numbers :");
   int n = sc.nextInt();
   
      primeNo(n);

}
}