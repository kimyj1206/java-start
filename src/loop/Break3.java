package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        // 카운터 변수가 명확, 반복 횟수가 정해진 경우 for문 사용
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum);
                break;
            }
        }
    }
}
