package operator;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&& : AND 연산"); // 두 피연산자가 모두 참이어야 true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("|| : OR 연산"); // 두 피연산자 중 하나라도 참이면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); // 참 -> 거짓, 거짓 -> 참
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
