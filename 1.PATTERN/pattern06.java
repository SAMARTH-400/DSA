import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars1 = (n+1)/2;
        int space = 1;

        for(int line = 1 ; line <= n ; line++){
            for(int i=1 ; i<=stars1 ; i++) System.out.print("*	");
            for(int j=1 ; j<=space ; j++)  System.out.print("	");
            for(int i=1 ; i<=stars1 ; i++) System.out.print("*	");
            System.out.println();
            if(line<=n/2){
                stars1=stars1-1;
                space=space+2;
            }
            else{
                stars1=stars1+1;
                space=space-2;
            }
        }
    }
}
