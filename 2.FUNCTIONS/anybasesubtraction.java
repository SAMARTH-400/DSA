import java.util.Scanner;

public class anybasesubtraction{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    public static int getDifference(int b, int n1, int n2){
        int ans = 0;
        int i = 1;

        int diff;
        int borrow = 0;
        while(n2!=0){
            int r2 = n2 % 10;
            int r1 = n1 % 10;
            if(r2>=r1+borrow){
                diff = r2 - r1 -borrow;
                borrow = 0;
            }
            else{
                diff = r2+b- r1-borrow;
                borrow = 1;
            }
            n2 = n2/10;
            n1 = n1/10;
            ans = ans + (diff*i);
            i = i*10;
        }
        return ans;
    }
}