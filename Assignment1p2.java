import java.util.Scanner;

public class Assignment1p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2], sum = new int[2][2], diff = new int[2][2], prod = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
                prod[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        printMatrix("Addition:", sum);
        printMatrix("Subtraction:", diff);
        printMatrix("Multiplication:", prod);
    }

    static void printMatrix(String msg, int[][] m) {
        System.out.println(msg);
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}