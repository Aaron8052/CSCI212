import java.awt.*;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ratings {
    static int[] ratings;

    public static void main(String[] args){
        var list = new ArrayList();
        Scanner keyboardScanner = new Scanner(System.in);
        int step = 1;
        int input = -1;
        while (input != 0) {
            System.out.print("Please input rating " + step + " : ");

            input = keyboardScanner.nextInt();
            if (input == 0)
                break;

            if (input < 1 || input > 5) {
                System.out.println("Invalid input, try again.");
                continue;
            }
            keyboardScanner.nextLine();
            step++;
            list.add(input);
        }
        ratings = new int[list.size()];
        System.out.print("Customer Ratings: ");
        var value = (int)list.get(0);
        System.out.print(value);
        ratings[0] = value;

        for (var i = 1; i < ratings.length; i++) {
            value = (int)list.get(i);
            System.out.print(", " + value);
            ratings[i] = value;
        }
        System.out.println();
    }
}
