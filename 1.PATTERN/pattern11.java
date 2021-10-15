import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit=1;
        for(int line=1;line<=n;line++){
            while(digit<=(line*(line+1))/2){
                System.out.print(digit+"	");
                digit++;
            }
            System.out.println();
        }
    }
}
