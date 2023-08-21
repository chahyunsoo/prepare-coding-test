package Level1.자릿수_더하기;

import java.util.ArrayList;
import java.util.List;

public class another_practice_Solution {
    public static int solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int answer = 0;
        String intToString = Integer.toString(n);
        int x = intToString.length();
        List<String> list = new ArrayList<>();
        list.add("1");
        for (int i = 1; i < x; i++) {
            list.add("0");
        }
        String[] strings = list.toArray(new String[list.size()]);
        for (String s : strings) {
            stringBuilder.append(s);
        }
        int newNum = Integer.parseInt(stringBuilder.toString());

        while (newNum>0) {
            int value = n / newNum;
            answer += value;
            n = n % newNum;
            newNum /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
