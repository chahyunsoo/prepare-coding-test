package Level1.짝수와_홀수;

class Solution {
    public static String solution(int num) {
        String answer = "";
        if(num%2==0){answer="Even";}
        else
            answer="Odd";
        return answer;
    }
    public static void main(String[] args) {
        String test1 = solution(3);
        String test2 = solution(4);
        System.out.println(test1 + " " + test2);
    }
}