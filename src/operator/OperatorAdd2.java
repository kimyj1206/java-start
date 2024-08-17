package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 먼저 증가시킨 후, b에 그 결과를 대입함
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2

        // 후위 증감 연산자
        a = 1;
        b = 0;
        b = a++; // a의 현재 값을 b에 먼저 대입한 후, 그 후 a의 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1
    }
}
