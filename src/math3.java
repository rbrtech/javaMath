//Java Guessing Game
import java.util.*;
public class math3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;
//      Random number
        int randNum = (int)(Math.random()*50);
//      DEBUG
//        System.out.println(randNum);


        while (running) {
            System.out.println("Enter a number from 1-50");
            int guessNum = input.nextInt();

            int diff = (randNum - guessNum);
//        System.out.println(diff);


            if (Math.abs(diff) == 0) {
                System.out.println("You Win!");
                running = false;
            }

//        if(guessNum == randNum){
//            System.out.println("You Win!");
//        }

            else if (Math.abs(diff) <= 5) {
                System.out.println("HOT!");
            } else if (Math.abs(diff) <= 10) {
                System.out.println("VERY WARM");
            } else if (Math.abs(diff) <= 25) {
                System.out.println("COLD!");
            } else if (guessNum > 50) {
                System.out.println("Invalid Input");
            }
        }
    }
}
