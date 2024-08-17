package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue); // maxIntValue casting = 2147483647

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); // maxIntOver casting = -2147483648 -> 오버플로우 발생
    }
}
