import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star1 = (n+1)/2;int star2 = n/2;
        for(int line = 1 ; line <= n ; line++ ){
            for(int i = 1 ; i <= star1 ; i++){
                if(line==1 || line==(n+1)/2)  System.out.print("*	");
                else if(line>(n+1)/2 && i==1 )  System.out.print("*	");
                else if(i==star1)  System.out.print("*	");
                else  System.out.print("	");
            }
            for(int j = 1 ; j <= star2 ; j++){
                if(line==n || line==(n+1)/2)  System.out.print("*	");
                else if(line<(n+1)/2 && j==star2 )  System.out.print("*	");
                else System.out.print("	");
            }
            System.out.println();
        }
    }
}
