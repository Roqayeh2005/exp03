package exp03;

import java.util.Scanner;

public class E3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("تعداد سطرها: ");
        int m = in.nextInt();
        System.out.print("تعداد ستون‌ها: ");
        int n = in.nextInt();

        int[][] A = new int[m][n];
        System.out.println("عناصر ماتریس را وارد کنید:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = in.nextInt();
            }
        }

        System.out.print("شماره سطر برای حذف (1 تا " + m + "): ");
        int r = in.nextInt() - 1;
        System.out.print("شماره ستون برای حذف (1 تا " + n + "): ");
        int c = in.nextInt() - 1;

        System.out.println("ماتریس پس از حذف سطر و ستون انتخاب‌شده:");
        for (int i = 0; i < m; i++) {
            if (i == r) continue;
            for (int j = 0; j < n; j++) {
                if (j == c) continue;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
