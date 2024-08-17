package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int price;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택: ");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.print("입금액을 입력하세요: ");
                price = scanner.nextInt();
                balance = deposit(balance, price);
            } else if (num == 2) {
                System.out.print("출금액을 입력하세요: ");
                price = scanner.nextInt();
                balance = withdraw(balance, price);
            } else if (num == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (num == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하였습니다.");
            }
        }
    }

    public static int deposit(int balance, int price) {
        balance += price;
        System.out.println(price + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int price) {
        if (price > balance) {
            System.out.println(price + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= price;
            System.out.println(price + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
