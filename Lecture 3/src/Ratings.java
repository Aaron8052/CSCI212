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
        int input = -1;
        while (input != 0) {
            System.out.print("Enter ratings (1-5, 0 to stop): ");

            input = keyboardScanner.nextInt();
            if (input == 0)
                break;

            if (input < 1 || input > 5) {
                System.out.println("Invalid input, try again.");
                continue;
            }
            keyboardScanner.nextLine();
            list.add(input);
        }
        keyboardScanner.close();

        ratings = new int[list.size()];
        System.out.print("Customer Ratings: ");
        var value = (int)list.get(0);
        System.out.print(value);
        ratings[0] = value;

        int[] stats = new int[5];



        for (var i = 1; i < ratings.length; i++) {
            value = (int)list.get(i);
            stats[value -1] ++;
            System.out.print(", " + value);
            ratings[i] = value;
        }
        System.out.println();


        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < 1)
                continue;
            System.out.print("Rating " + (i + 1) + ": " );
            // TODO
        }
    }
}
