class Box{
    double l;
    double w;
    double h;

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
}

 class BoxWeight extends Box{
    double weight;

    public BoxWeigth(){
        this.weight = -1;
    }

    BoxWeight(double l,double w,double h,double weight){
        this.weight = weight;
        // super(l,h,w)
    }
}

class Main{
    public static void main(String [] args){
         BoxWeight box = new BoxWeight(2.0,4.0,3.1,1.0);
         System.out.println(box);
    }
}