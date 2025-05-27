class Parent{
    public void show(){
        System.out.println("THis is parent");
    }
    public void show(int a){
        System.out.print("This is with parameter"+a);
    }
}

class Child extends Parent{
    @Override public void show(){
        System.out.println("This is child class");
    }
}






public class MethodOver {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
        ch.show(1);
        
        
    }
}
