package operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false - a와 b가 같지 않다
        System.out.println(a != b); // true - a와 b가 다르다

        System.out.println(a > b); // false - a는 b보다 크지 않다
        System.out.println(a < b); // true - a는 b보다 작다

        System.out.println(a >= b); // false - a는 b보다 크거나 같지 않다
        System.out.println(a <= b); // true - a는 b보다 작거나 같다

        boolean result = a == b;
        System.out.println("a = b = " + result);
    }
}