//Q.Make a function to print a table of given number.

import java.util.*;
class table
{
 public static void printTable(int n)
 {
     int table=0;
    for(int i=1;i<=10;i++)
    {
         table=i*n;
         System.out.println(table);
    }
    
 }


 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a numbers :");
   int n = sc.nextInt();
    System.out.println("Table of "+ n +" is ");
      printTable(n);

}
}