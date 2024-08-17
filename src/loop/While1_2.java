package loop;

public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            // 조건식의 결과값이 참이면 실행되는 코드 블럭, 코드 블럭이 끝나면 다시 조건식 검사
            count++;
            System.out.println("현재 숫자는 : " + count);
        }
    }
}
