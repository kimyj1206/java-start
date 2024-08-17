package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            // 조건 상관없이 무조건 한 번 실행되는 코드 블럭
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
