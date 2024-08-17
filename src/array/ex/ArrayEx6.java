package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int input = scanner.nextInt();

        System.out.println(input + "개의 정수를 입력하세요");
        int[] numbers = new int[input];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minValue);
        System.out.println("가장 큰 정수 : " + maxValue);
    }
}
