package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

//        sum += i;
//        System.out.println("i = " + i + " sum = " + sum);
//        i++;
//
//        sum += i;
//        System.out.println("i = " + i + " sum = " + sum);
//        i++;
//
//        sum += i;
//        System.out.println("i = " + i + " sum = " + sum);
//        i++;

        // 위 코드를 변경
        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
