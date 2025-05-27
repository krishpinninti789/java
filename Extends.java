 class  Parent{
    public void show(){
        System.out.println("This is parent class method");
    }
}

class Child extends Parent {
    public void display(){
        System.out.println("This is child method");

    }
     
}




public class Extends {
    public static void main(String[] args)throws Exception {
        Child ch = new Child();
        ch.show();
        ch.display();
        
    }
    
}
