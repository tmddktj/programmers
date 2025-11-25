class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainder = 0;
        for(int i = 1; n/i > 0; i*=10){//각 자리의 숫자는 1,10,100,...의 자릿수로 10으로 나눈 나머지의 합으로 생각할 수 있다. 
            remainder += (n/i)%10;// (n%10)+(n/10%10)+(n/10/10%10)+...로 각자릿수의 합을 구할 수 있다.
        }
        return answer = remainder;
    }
}