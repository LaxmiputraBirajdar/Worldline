package Worldline;

class king{

    int hey = 9;
    public void hello(){
        System.out.println("i am in the King class");
    }

}

class man extends king{

    public void hello(){
        System.out.println("i am the Overriden");
    }

}

public class iam {

    int roll;
    String name ;

    public iam(){
        System.out.println("Object of iam class is created");
    }

    public iam(int r, String n){
        this.roll = r;
        this.name = n;
    }

    public void hello(){
        System.out.println(" I am here to Say Hello");
    }
    
    public static void main(String[] args) {

        man obj = new man();
        // System.out.println(obj.name);
        System.out.println(obj.hey);
        obj.hello();
       
        
    }
    
}
