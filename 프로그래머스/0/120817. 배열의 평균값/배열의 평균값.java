class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int number : numbers){
            sum += number; //향상된 for문을 사용하여 
        }
        answer = (double) sum/numbers.length; 
        /*
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i]; //numbers의 원소만큼 증가하도록 작성
            }
        answer = (double) sum/numbers.length;    
        */
        return answer;
    }
}