public class Animal {
    void eat(){

    }
}
class dog extends Animal{
    void eat(){
        System.out.println("Eating any food");
    }
}
class lion extends Animal{
    @Override
    void eat() {
        System.out.println("Eating meet only");
    }
}
class RunCode{
    public static void main(String[] args) {
        Animal d = new dog();
        Animal l = new lion();
        d.eat();
        l.eat();
    }
}