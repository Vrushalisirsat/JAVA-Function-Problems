// Q.Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
class Average{

    public static int averageOfNo(int a,int b,int c)
    {
        return (a+b+c)/3;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

       System.out.println("Average of 3 numbers is " + averageOfNo(a,b,c));
    }
}