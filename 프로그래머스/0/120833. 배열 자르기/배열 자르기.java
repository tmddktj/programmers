class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];//answer 배열의 크기: num1번째, num2번째 인덱스 포함이므로 두 수의 차에서 1을 더한 크기이다.
        int num = num1;//answer로 반환될 numbers 배열 인덱스 시작값을 설정한다.
        for(int i = 0; i <= num2 - num1; i++){
            answer[i] = numbers[num];//answer 배열에 numbers 배열의 num1번째 인덱스부터 반환되도록 작성
            num++;//answer 배열 인덱스가 1씩 증가할때마다 numbers 배열 인덱스도 1씩 증가한다.
        }
        return answer;
    }
}