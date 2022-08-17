//Q.Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
class sumOfOddNo
{
 public static int oddNoSum(int n)
 {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        if(i%2 != 0)
        {
            sum=sum+i;
        }
    }
    return sum;
    
 }


 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a numbers :");
   int n = sc.nextInt();

    System.out.println("Sum of all odd No. is "+ oddNoSum(n));


}
}