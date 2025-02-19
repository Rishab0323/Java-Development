class Recursion{
    public static void main(String [] args){
        int n =10;
    IncreaseNum(n);
        
    }

    public static void IncreaseNum(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        IncreaseNum(n-1);
        System.out.print(n +" ");
    }
}