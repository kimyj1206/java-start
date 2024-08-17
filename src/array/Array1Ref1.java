package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; // 배열 변수 선언 --> 선언만 할 뿐 아직 사용하지 못 함.
        students = new int[5]; // 배열 생성 --> int형 변수 5개를 다룰 수 있는 배열을 새로 만든다는 뜻

        System.out.println(students); // 배열의 참조값을 확인하고 싶을 때 사용

        // 배열 변수에 값 대입 --> [] 사이에 들어간 숫자는 인덱스(index)로 배열의 위치를 나타냄
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        // students[5] = 40; // java.lang.ArrayIndexOutOfBoundsException : Index 5 out of bounds for length 5

        // 배열 변수 값 사용
        System.out.println("학생1의 점수 = " + students[0]);
        System.out.println("학생2의 점수 = " + students[1]);
        System.out.println("학생3의 점수 = " + students[2]);
        System.out.println("학생4의 점수 = " + students[3]);
        System.out.println("학생5의 점수 = " + students[4]);
    }
}
