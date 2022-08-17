//Q.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
class vote{

    public static void eligibleForVote(int age)
    {
        if(age>=18)
        {
            System.out.println("Person is Eligible for vote");
        }
        else{
            System.out.println("Person is Not Eligible for vote");
        }
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age :");
        int age=sc.nextInt();
        

        eligibleForVote(age);
    }
}