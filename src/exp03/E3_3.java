package exp03;

import java.util.Scanner;

public class E3_3 {
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

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += A[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("سطر با بیشترین مجموع عناصر: " + (maxRow + 1));
        System.out.println("مجموع عناصر آن سطر = " + maxSum);
    }
}
