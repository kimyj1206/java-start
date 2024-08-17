package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);
            System.out.println("for i = " + i); // for문 내부에서만 사용 가능한 변수
        }

        // System.out.println("i = " + i); // java: cannot find symbol variable i
        System.out.println("main m = " + m);
    }
}
