class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int maxNumber1 = numbers[0];
        int maxNumber2 = numbers[1];
        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > maxNumber1){//초기설정된 배열의 값보다 큰값이 있는 경우
                maxNumber2 = maxNumber1;//기존 큰 수를 두번째 큰 수에 대입
                maxNumber1 = numbers[i];//가장 큰 수를 새로 대입
            }
            if(numbers[i] > maxNumber2 && numbers[i] < maxNumber1){//두번째 큰 수보다 크면서 가장 큰 수는 아닌경우
                maxNumber2 = numbers[i];//두번째 큰 수를 새로 대입
            } 
        }
        answer = maxNumber1 * maxNumber2;//가장 큰 수와 두번째 큰수를 곱함
        return answer;
    }
}