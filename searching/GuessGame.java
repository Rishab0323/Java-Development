class GuessGame{
    public static void main(String[] args){
        
// the  below is the solution for leetcode problem 374 ,easy level
        public int guessNumber(int n) {
        // int target = guess(pick);
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if( res == 0 ){
                return mid;
            }
            else if( res < 0){
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
            
        }
        return -1;
    }
    }
}