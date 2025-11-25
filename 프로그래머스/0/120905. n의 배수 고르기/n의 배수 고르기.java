class Solution {
    public int[] solution(int n, int[] numlist) {
        int answerArray =0; //answer 배열의 크기 구하기
        for(int numlistIndex=0; numlistIndex < numlist.length; numlistIndex++){
            if(numlist[numlistIndex]%n == 0){
                answerArray++;//n의 배수이면 배열의 크기가 1씩 증가
            }
        }
        
        int[] answer = new int[answerArray]; // 배수의 숫자만큼 배열의 크기 설정
        int answerIndex = 0;
        for(int numlistIndex=0; numlistIndex < numlist.length; numlistIndex++){
            if(numlist[numlistIndex]%n == 0){//numlist의 배열 차례대로 n의 배수인 경우 answer의 배열에 차례로 반환되도록 설정
                answer[answerIndex]=numlist[numlistIndex];
                answerIndex++;
            }
        }
        return answer;
    }
}