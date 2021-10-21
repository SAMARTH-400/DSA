import java.util.Scanner;

public class decimaltoanybase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n, int b){
        int value = 0;
        int i=0;
        while(n!=0){
            int r = n%b;
            int k = (int) Math.pow(10,i);
            value = value+(r*k);
            n = n/b;
            i++;
        }
        return value;
    }
}
