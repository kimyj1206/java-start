package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        // 배열 변수 선언, 배열 생성과 초기화를 한 번에 가능
        // int[] students = new int[] {90, 80, 70, 60, 50};
        int[] students = {90, 80, 70, 60, 50}; // 자바 내부에서 배열 요소의 크기를 보고 new int[5]을 사용해서 배열 생성

        // 아래 방법은 오류 발생
        // int[] students;
        // students = {90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 = " + students[i]);
        }
    }
}
