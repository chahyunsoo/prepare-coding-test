package Level0.분수의_덧셈;

import java.util.Arrays;

public class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int up=numer1*denom2+numer2*denom1;
        int down=denom1*denom2;
        int result=gcd(up,down);
        int[] answer = {up/result,down/result};

        return answer;
    }

    public static void main(String[] args) {
        int[] test1=solution(1, 2, 3, 4);
        int[] test2=solution(9, 2, 1, 3);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}