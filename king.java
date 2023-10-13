package Worldline;

abstract class Absclass{

    public abstract void Hello();
}

class Theme extends Absclass{

    public void Hello(){
        System.out.println("this is the Abstract Method Body Provided By Abstract Class");
    }

}

public class king{
    public static void main(String[] args) {
    
        Theme obj = new Theme();
        obj.Hello();
    }   
}


