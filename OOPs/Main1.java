class Shapes{
    void area(){
        System.out.println("I am in shape"  );
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("area is pi sq r");
    }
} 

class Triangle extends Shapes{
    void area(){
        System.out.println("area is base x height");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("area is square 4 x 4");
    }
}

public class Main1{
    public static void main(String [] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square(); //left side parent object refernce but it is of child obj

        circle.area();
        square.area(); 
    }
}