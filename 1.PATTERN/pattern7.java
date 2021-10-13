import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        for(int line=1 ; line<=n ; line++){

            for(int i=1 ; i<=space ; i++){
                System.out.print("	");
            }

            System.out.print("*");
            System.out.println();
            space++;
        }
    }
}
