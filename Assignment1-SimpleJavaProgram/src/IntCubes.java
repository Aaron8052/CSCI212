public class IntCubes {

    public static void main(String[] args)
    {
        var sum = 0f;
        for (int i = 1; i <= 6; i++ ) {
            var cube = cube(i);
            System.out.println("" + i + " Cube = " + cube);
            sum += cube;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 6));
    }

    static int cube(int val){
        return val * val * val;
    }
}


