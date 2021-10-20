import java.util.Scanner;

public class anybasetodecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
    public static int getValueIndecimal(int n, int b){
        int value=0;
        int i=0;
        while(n!=0){
            int r = n % 10;
            int k=(int)Math.pow(b,i);
            value = value + r*k;
            i++;
            n = n/10;
        }
        return value;
    }
}
