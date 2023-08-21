package Level1.나머지가_1이_되는_수_찾기;

public class Solution {
    public static int solution(int n) {
        int answer = 1;
        while ((n % answer != 1)) {
            answer++;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int test1 = solution(8);
        System.out.println("test1 = " + test1);
        int test2 = solution(21);
        System.out.println("test2 = " + test2);
        int test3 = solution(24);
        System.out.println("test3 = " + test3);

    }
}
