// Q. WAP to enter a 2 no. from the user x & n,write a function to find the values of one number raised to the power of another no. ie. x^n

import java.util.*;

class power{
        
        public static void printPower(int x,int n)
        {
            int power=1;

            for(int i=1;i<=n;i++)
            {
                power=power*x;
            }
            System.out.println("Power is " + power);
        }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x & n :");
        int x=sc.nextInt();
        int n=sc.nextInt();

         printPower(x,n);
    }
}