import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int line=1 ; line<=n ; line++) {
            for (int space = 1; space <= n - line; space++) {
                System.out.print("	");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*	");
            }
            System.out.println();
        }
    }
}
