import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit1 = 0;
        int digit2 = 1;
        for(int line=1 ; line<=n ; line++){
            for(int i=1; i<=line ;i++){
                System.out.print(digit1+"	");
                digit2=digit1+digit2;
                digit1=digit2-digit1;
            }
            System.out.println();
        }
    }
}
