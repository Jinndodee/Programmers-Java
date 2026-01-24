class Solution {
    public int solution(int num, int n) {
        int result = num % n;
        return result == 0 ? 1 : 0;
    }
}