import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ncopy = n;
        int temp = n/2;
        int x =1;
        int y =1;
        for(int line = 1 ; line <= (n+1)/2 ; line++){
            for(int space = 1 ; space <= temp ; space++){
                System.out.print("	");
            }
            for(int star = 1 ; star <= x ; star++){
                System.out.print("*	");
            }
            temp = temp-1;
            x = x+2;
            System.out.println();

        }

        for(int line = 1 ; line <= n/2 ; line++){
            for(int space = 1 ; space <=y ; space++){
                System.out.print("	");
            }
            for(int star=1 ; star<=ncopy-2 ; star++){
                System.out.print("*	");
            }

            y=y+1;
            ncopy=ncopy-2;
            System.out.println();
        }
    }
}
