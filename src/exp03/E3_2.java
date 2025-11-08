package exp03;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][2];

        System.out.println("عناصر ماتریس ۲×۲ را وارد کنید:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = input.nextInt();

        int det = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        System.out.println("دترمینان ماتریس = " + det);
    }
}
