// Q. WAP to find the binary coefficient (nCr).
// nCr=n!/(n-r)!*r!
import java.util.*;
class combination
{
   
  public static int fact(int n)
   {
    int Fact=1;
     for(int i=1;i<=n;i++)
     {
        Fact=Fact*i;
     }

     return Fact;
   }


     public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the value of n & r :");
   int n = sc.nextInt();
   int r = sc.nextInt();
  
  int nCr=fact(n)/(fact(n-r)*fact(r));
     System.out.print("nCr =" + nCr);
    
 }
}