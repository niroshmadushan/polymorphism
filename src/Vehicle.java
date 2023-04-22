public class Vehicle {
    void drive(){
        System.out.println("Drive Speed limit 100 Kmph");
    }
}
class car extends Vehicle{
    void drive(){
        System.out.println("Drive Speed limit 150 Kmph'");
    }
}
class RunProgramme{
    public static void main(String[] args) {
        Vehicle c = new car();
        Vehicle v = new Vehicle();

        c.drive();
        v.drive();
    }
}