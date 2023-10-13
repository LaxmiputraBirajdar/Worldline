package Worldline;

class shape{
    public void draw(){
        System.out.println("Drawing a Shape");
    }
}

class circle extends shape{
    @Override
    
    public void draw(){
        super.draw();
        System.out.println("Drawing a Circle");
    }
}

public class methodride {
    public static void main(String[] args){
        shape s = new circle();
        s.draw();
    }


    
}
