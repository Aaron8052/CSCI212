import java.lang.classfile.constantpool.DoubleEntry;

public class Methods {
    public static void main(String args[]) {
    	int x = 5, y = 8;
        double a = 2.5, b = 4.0;

        System.out.println(add(x, y));              // prints 13
        System.out.println(average(a, b));          // prints 3.25

        if (isLarger(y, x))                        
            System.out.println("Yes");
        
        double result = calculate(x, average(a, b)); 

        f(average(a, b), calculate(x, f(20, a - b)));   
    }
    
    // Write the best title line for each method.
    // The method bodies are not needed.
    static int add(int x, int y){
        return x+y;
    }
    static double add(double x, double y){return x + y;}
    static double average(double a, double b){
        return (a+b) / 2;
    }

    static boolean isLarger(int x, int y){
        return x > y;
    }

    static double calculate(double x, double y){
        return 0;
    }

    static double f(double x, double y){
        return 0;
    }
} 