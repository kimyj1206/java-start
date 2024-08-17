package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number); // double -> int 형 변환
    }

    public static void printNumber(int num) {
        System.out.println("숫자 : " + num);
    }
}
