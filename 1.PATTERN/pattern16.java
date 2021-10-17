import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = (2 * n) - 3;
        for (int line = 1; line <= n; line++) {
            int value = 1;
            int value2 = line;
            for (int num = 1; num <= line; num++) {
                System.out.print(value + "	");
                value++;
            }
            for (int i = 1; i <= space; i++) System.out.print("	");
            for (int num2 = 1; num2 <= line; num2++) {
                if (value2 != n) System.out.print(value2 + "	");
                value2--;
            }
            System.out.println();
            space = space - 2;
        }
    }
}
