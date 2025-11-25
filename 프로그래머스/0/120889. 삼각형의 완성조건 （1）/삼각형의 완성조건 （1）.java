class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxSides = sides[0];// 가장 긴변의 초기값 설정
        int sumSides = sides[0] + sides[1] + sides[2];//세 변의 합
        for(int i = 0; i < sides.length; i++){
            if(sides[i] > maxSides){
                maxSides = sides[i];// 가장 긴변의 길이 구하기
            }
        }
        if(maxSides < sumSides-maxSides){// 삼각형의 만들기 위한 조건이 참인 경우 answer값 1
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}