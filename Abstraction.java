
abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();
    void start(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicle{
    @Override void accelerate(){
        System.out.println("Car pressing pedal");
    }
    @Override void brake(){
        System.err.println("Car hold on brake");
    }

}







public class Abstraction {
    public static void main(String[] args) {
        Car vh = new Car();
        vh.start();
        vh.accelerate();
        vh.brake();

        
    }
}
