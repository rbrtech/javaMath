import java.util.Scanner;
public class diceGame {
    public static void main (String [] args){
//      Scanner input instance
        Scanner input = new Scanner(System.in);
//      Random number as compNum
        int compNum = (int) (Math.random()*6)+1;
//      User Directions
//        System.out.println("Enter a number from 1-6");
//      User input
//        int myNum = input.nextInt();

//      Random input as myNum
        int myNum = (int) (Math.random()*6)+1;
        System.out.println("myNum = " + myNum);

        if(myNum > compNum){
            System.out.println("You win!");
        }

        else if(myNum == compNum) {
            System.out.println("A tie!");
        }

        else if(myNum < compNum) {
//        else {
            System.out.println("You Lose!");
        }

//      DEBUG
        System.out.println("compNum = " + compNum);
    }
}
