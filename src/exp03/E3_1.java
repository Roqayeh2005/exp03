package exp03;

import java.util.Scanner;

public class E3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("تعداد سطرهای ماتریس اول: ");
        int r1 = input.nextInt();
        System.out.print("تعداد ستون‌های ماتریس اول: ");
        int c1 = input.nextInt();
        System.out.print("تعداد سطرهای ماتریس دوم: ");
        int r2 = input.nextInt();
        System.out.print("تعداد ستون‌های ماتریس دوم: ");
        int c2 = input.nextInt();

        if (c1 != r2) {
            System.out.println(" ضرب ماتریس‌ها ممکن نیست! (تعداد ستون‌های اول با سطرهای دوم برابر نیست)");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("عناصر ماتریس اول را وارد کنید:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = input.nextInt();

        System.out.println("عناصر ماتریس دوم را وارد کنید:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = input.nextInt();

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("نتیجه ضرب دو ماتریس:");
        for (int[] row : C) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
