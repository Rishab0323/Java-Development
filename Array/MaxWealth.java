class maxWealth {
    public int maximumWealth(int[][] accounts) {
       
        int maxWealth = 0;
        for(int i=0;i<accounts.length;i++){
            int curWealth = 0;
           for(int j=0;j<accounts[i].length;j++){
            curWealth += accounts[i][j];
           }

           if(curWealth > maxWealth){
            maxWealth = curWealth;
           }
        }
        return maxWealth;
    }
}