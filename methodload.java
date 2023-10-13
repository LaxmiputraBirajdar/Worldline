package Worldline;

class calculator {

    public void cal(int a, int b){

        System.out.println(a+b);
    }

     public void cal(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class methodload {
    public static void main(String[] args){

        calculator obj = new calculator();

        obj.cal(2,3,5);
    }
    
}
