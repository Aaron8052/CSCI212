import java.util.Scanner;

public class SwapWords {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some words: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        // Write your code here.

        input.close();
    }
}
