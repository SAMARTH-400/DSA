import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int line =0 ; line<n ; line++){
            int ans = 1;
            for(int i = 0 ; i<=line ;i++){
                System.out.print(ans+"	");
                ans = ans * (line-i)/(i+1);
            }
            System.out.println();
        }
    }
}
