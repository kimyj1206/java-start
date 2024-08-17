package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                // 조건식의 결과 값이 1일 때 실행되는 코드
                coupon = 1000;
                break;
            case 2:
                // 조건식의 결과 값이 2일 때 실행되는 코드
                coupon = 2000;
                break;
            case 3:
                // 조건식의 결과 값이 3일 때 실행되는 코드
                coupon = 3000;
                break;
            default:
                // 조건식의 결과 값이 어디에도 해당되지 않을 때 실행되는 코드
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
