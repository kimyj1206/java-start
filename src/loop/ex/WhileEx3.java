package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 0;


        // max = 2
        // sum = 3 (1 + 2)

        // max = 3
        // sum = 6 (1 + 2 + 3)
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
