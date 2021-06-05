package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem23 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? y or n ");
        String ans = a.next();
        if(ans.equals("y")){
            System.out.print("Are the batter terminals corroded? ");
            ans = a.next();
            if(ans.equals("y"))
                System.out.println("Clean terminals and try starting again");
            else System.out.println("Replace cables and try again");
        }
        else{
            System.out.print("Does the car make a slicking noise?");
            ans = a.next();
            if(ans.equals("y"))
                System.out.print("Replace the battery");
            else{
                System.out.print("Does the car crank up but fail to start?");
                ans = a.next();
                if(ans.equals("y"))
                    System.out.print("Check spark plug connections");
                else{
                    System.out.print("Does the engine start and then die?");
                    ans = a.next();
                    if(ans.equals("y")){
                        System.out.print("Does your car have fuel injection?");
                        ans = a.next();
                        if(ans.equals("y"))
                            System.out.print("Get it in for service");
                        else System.out.print("Check to ensure the choke is opening and closing");
                    }
                    else System.out.print("This should not be possible");
                }
            }
        }
    }
}
