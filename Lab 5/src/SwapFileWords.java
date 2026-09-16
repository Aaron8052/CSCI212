import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SwapFileWords {
    public static void main(String args[]) {
        var file = new File("words.txt");
        var resultFile = new File("swapped.txt");

        try {
            var writer = new PrintWriter(resultFile);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var swapped = Swap(line);
                writer.println(swapped);
            }
            writer.close();
            input.close();
        }
        catch (Exception ex){

        }
    }


    static String Swap(String original){
        if (original.length() < 2)
            return original;

        var first = original.charAt(0);
        var lastIndex = original.length() -1;
        var last = original.charAt(lastIndex);
        return first + original.substring(1, lastIndex) + last;
    }
}
