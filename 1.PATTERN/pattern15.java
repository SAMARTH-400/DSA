import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=n/2;
        int star=1;
        for(int line=1 ; line<=n ; line++){
            for(int i=1 ; i<=space ; i++){
                System.out.print("	");
            }
            int digit = line<=(n+1)/2 ? line : n-line+1;

            for(int j=1 ; j<=star ;j++){
                System.out.print(digit+"	");
                if(j<=star/2)  digit++;
                else  digit--;
            }
            System.out.println();
            if(line<(n+1)/2){
                space--;
                star=star+2;
            }
            else {
                space++;
                star = star - 2;
            }
        }
    }
}
