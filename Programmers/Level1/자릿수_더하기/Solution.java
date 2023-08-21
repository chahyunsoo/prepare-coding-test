package Level1.자릿수_더하기;

import java.util.Arrays;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        String[] str = String.valueOf(n).split("");
        for (String s : str) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
