package operator;

public class Operator2 {

    public static void main(String[] args) {
        // 문자열 + 문자열
        String result1 = "hello " + "world";
        System.out.println("result1 = " + result1); // result1 = hello world

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2); // result2 = string1string2

        // 문자열 + 숫자
        String result3 = "a + b = " + 10;
        System.out.println(result3); // a + b = 10

        int num = 20;
        String str = "a + b = " + num;
        System.out.println(str); // a + b = 20
    }
}
