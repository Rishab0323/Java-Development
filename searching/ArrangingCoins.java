class ArrangingCoins{
    public static void main(String [] args){
        int n =5;
        public int arrangeCoins(int n) {
      int stair = 1;
      int coin_left = n;
      int count = 0;
      if(n == 0 || n == 1){
        return n;
      }
      while( coin_left >= stair){
        coin_left = coin_left - stair;
        count++;
        stair++;
      }

      return count;  
    }
    }
}