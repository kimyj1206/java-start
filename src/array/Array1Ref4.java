package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 점수를 추가해도 해당 부분만 변경하면 됨

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 = " + students[i]);
        }
    }
}
