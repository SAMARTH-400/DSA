import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space1 = 0; int space2 = n-2;

        for(int line=1 ;line<=n ; line++){
            for(int i =1 ; i<=space1 ; i++){
                System.out.print("	");
            }
            System.out.print("*	");
            for(int j=1 ; j<=space2 ; j++){
                System.out.print("	");
            }
            if( line!=(n+1)/2 )  System.out.print("*");
            System.out.println();
            if(line<=n/2){
                space1++;
                space2=space2-2;
            }
            else{
                space1--;
                space2=space2+2;
            }
        }
    }
}
