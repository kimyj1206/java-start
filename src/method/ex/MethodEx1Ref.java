package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값 : " + add(1, 2, 3));

        System.out.println("평균값 : " + add(15, 25, 35));
    }

    public static double add(int a, int b, int c) {
        int sum = a + b + c;
        return (double) sum / 3;
    }
}
