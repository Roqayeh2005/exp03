package exp03;

import java.util.Scanner;

public class E3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("تعداد سطرها: ");
        int m = input.nextInt();
        System.out.print("تعداد ستون‌ها: ");
        int n = input.nextInt();

        int[][] A = new int[m][n];
        System.out.println("عناصر ماتریس را وارد کنید:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = input.nextInt();

        int[][] T = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = A[i][j];

        System.out.println("ترانهاده ماتریس:");
        for (int[] row : T) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
