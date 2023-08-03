package Level1.최소직사각형;

class Solution {
    public static int solution(int[][] sizes) {
        int answer=0;
        int mw=0;
        int mh=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int a= sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=a;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(mw<sizes[i][0]){
                mw=sizes[i][0]; 
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(mh<sizes[i][1]){
                mh=sizes[i][1];
            }
        }
        answer=mw * mh;
        return answer;
    }
    public static void main(String[] args) {
            int[][] test1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
            int[][] test2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
            int[][] test3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

            System.out.println(solution(test1));
            System.out.println(solution(test2));
            System.out.println(solution(test3));
        }
}
