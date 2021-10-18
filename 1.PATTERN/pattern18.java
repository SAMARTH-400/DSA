import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        int star = n;
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= space; i++) {
                System.out.print("	");
            }
            for (int j = 1; j <= star; j++) {
                if (line > 1 && line < (n + 1) / 2 && j > 1 && j < star) System.out.print("	");
                else System.out.print("*	");
            }
            if (line <= n / 2) {
                space = space + 1;
                star = star - 2;
            } else {
                space = space - 1;
                star = star + 2;
            }
            System.out.println();
        }
    }
}

