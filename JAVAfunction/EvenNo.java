//Q.Make a function to check a number is even or not.

import java.util.*;
class EvenNo
{
 public static void isEven(int n)
 {
    if(n%2 == 0)
    {
        System.out.print("Even Number");
    }
    else
    {
         System.out.print("Not a Even Number");
    }
 }


 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a numbers :");
   int n = sc.nextInt();
   
      isEven(n);

}
}