import java.util.Scanner;

class Solution{
    public int decimaltoAnybase(int num,int base)
    {
        String result ="";
        while(num>0)
        {
            int x=num%base;
            result = x+result;
            num/=base;
        }
        return Integer.parseInt(result);
    }
}


public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        Solution answer = new Solution();
        System.out.println(answer.decimaltoAnybase(num,base));
    }
}
