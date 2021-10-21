import java.util.*;

public class  anybasemultiplication{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int getSum(int b, int n1, int n2){
        int carry = 0;
        int digit;
        int ans = 0;
        int i = 1;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            int sum = r1+r2+carry;

            digit = sum % b;
            carry = sum /b;
            ans = ans + (digit*i);
            n1 = n1 / 10;
            n2 = n2 / 10;
            i = i*10;
        }
        return ans;
    }
    public static int getProduct(int b, int n1, int n2){
        int ans=0;
        int k=1;

        while(n2!=0){
            int n1copy = n1;
            int ansl=0;
            int i =1;
            int carry=0;
            int r2 = n2%10;

            while(n1copy!=0 || carry!=0){
                int r1 = n1copy%10;
                int product = (r1*r2)+carry;
                carry = product/b;
                int digit = product%b;
                ansl = ansl+(digit*i);
                n1copy = n1copy/10;
                i=i*10;
            }
            ansl = ansl*k;
            ans = getSum(b,ans,ansl);
            n2  = n2/10;
            k=k*10;
        }
        return ans;
    }
}