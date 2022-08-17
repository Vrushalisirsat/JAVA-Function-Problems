//Q. WAP to print all prime Number between 2 given number.


import java.util.*;
class isPrimeNo
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number :");
   int a=sc.nextInt();
   int b=sc.nextInt();

    for(int i=a;i<=b;i++)
   {
     if(PrimeNo(i))
     {  
       System.out.println(i);
     }
   }
    
 }

  static boolean PrimeNo(int num)
  {
    for(int i=2;i<=num/i;i++)
   {
     if(num%i==0)
     {
       return false;
     }
   }
return true;

}
}