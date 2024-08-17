package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 해당 변수는 if문 내부에서만 사용하는데 변수 scope가 너무 넓어 비효율적인 메모리 사용과 코드 복잡성 증가

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
