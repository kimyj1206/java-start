package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) { // 조건식이 참이기에 무한 반복한다.
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum);
                break; // 반복문을 즉시 종료함
            }
            i++;
        }
    }
}
