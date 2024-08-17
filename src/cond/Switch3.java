package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                // 조건식의 결과 값이 1일 때 실행되는 코드
                coupon = 1000;
                break;
            case 2: // brake 문을 빼게 되면 중단하지 않고 다음 코드를 실행함
            case 3:
                // 조건식의 결과 값이 3일 때 실행되는 코드
                coupon = 3000;
                break;
            default:
                // 조건식의 결과 값이 어디에도 해당되지 않을 때 실행되는 코드
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon); // 발급받은 쿠폰 : 3000

        // java 14의 새로운 switch문
        int coupon2 = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 : " + coupon2);
    }
}