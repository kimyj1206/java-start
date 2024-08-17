package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 원래 값은 2.5가 되어야 하지만 int 형으로 연산했기에 결과값도 int 형이 나옴

        double div2 = (double) a / b;
        System.out.println("a / b = " + div2);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
