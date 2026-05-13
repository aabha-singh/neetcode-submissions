class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid = 0;
        int answer = 0;

        while(low <= high){
            mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if(square == x) return mid;
            else if(square > x) high = mid - 1;
            else if(square < x){
                answer = mid;
                low = mid + 1;
            }
        }

        return answer;

    }
}
