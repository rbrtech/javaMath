import java.util.Scanner;
public class diceGame {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        double myNum = Math.random()*5;

        myNum = Math.ceil(myNum);

        System.out.println(myNum);
    }
}
