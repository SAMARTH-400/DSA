import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2; int star =1;
        for(int line = 1 ; line <= n ; line++){
            for(int i = 1 ; i <= space ; i++){
                System.out.print("	");
            }
            for(int j = 1 ; j <= star ; j++){
                if(line!=n/2+1 && j<=star/2)  System.out.print("	");
                else  System.out.print("*	");
            }
            if(line < (n+1)/2){
                space = space-1;
                star = star+2;
            }
            else{
                space = space+1;
                star =star-2;
            }
            System.out.println();
        }
    }
}
