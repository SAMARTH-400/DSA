import java.util.*;

public class pattern20{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star1 = 1;
        int space = n-2;
        int star2 = 1;
        if(n>1){
            for(int line = 1 ; line <= n ; line++){
                for(int i = 1 ; i <= star1 ; i++){
                    if(i!=1 && line<=(n+1)/2 && i!=(n+1)/2)  System.out.print("	");
                    else if(line>(n+1)/2 && i>1&&i<star1 )  System.out.print("	");
                    else  System.out.print("*	");
                }
                for(int j = 1 ; j <= space ; j++){
                    System.out.print("	");
                }
                for(int k = 1 ; k <= star2 ; k++){
                    if(k!=star2 && line<=(n+1)/2)  System.out.print("	");
                    else if(line>(n+1)/2 && k>1 && k<star2 )  System.out.print("	");
                    else  System.out.print("*	");
                }
                System.out.println();
                if(line<n/2){
                    star1++;
                    space = space-2;
                    star2++;
                }
                else if(line==n/2){
                    star1++;
                    space = space-2;
                }
                else if(line==(n+1)/2){
                    star1--;
                    space = space+2;
                }
                else if(line>(n+1)/2){
                    star1--;
                    space = space+2;
                    star2--;
                }
            }
        }
        else  System.out.print("*");
    }
}