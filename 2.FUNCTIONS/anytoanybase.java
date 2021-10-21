import java.util.*;

public class anytoanybase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int decimal = getdecimal(n,sourceBase);
        int ans = getans(decimal,destBase);
        System.out.println(ans);
    }
    public static int getdecimal(int a , int b){
        int value=0;
        int i=1;
        while(a!=0){
            int r = a%10;
            value = value+(r*i);
            i=i*b;
            a=a/10;
        }
        return value;
    }
    public static int getans(int a , int b){
        int value=0;
        int i=1;
        while(a!=0){
            int r = a%b;
            value = value+(r*i);
            i=i*10;
            a=a/b;
        }
        return value;
    }
}