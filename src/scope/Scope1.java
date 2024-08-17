package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;

        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x); // x는 if문에서만 생존함
        }

        // System.out.println("main x = " + x); // java: cannot find symbol variable x
        System.out.println("main m = " + m);
    }
}
