// Q.Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
class circle{

    public static double printCircumference(int radius)
    {
        double C=2*3.14*radius;
        return C;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius :");
        int radius=sc.nextInt();
        

       System.out.println("printCircumference of circle  is " + printCircumference(radius));
    }
}