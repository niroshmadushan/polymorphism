public class GranddFather {
    void swim(){
        System.out.println("Swimming");
    }
}
class Father extends GranddFather{
    void swim(){
        System.out.println("Swimming in river");
    }
}
class Son extends Father{
    @Override
    void swim() {
        System.out.println("Swimming in pool");
    }

    public static void main(String[] args) {
        GranddFather f,s,gf;
        f = new Father();
        s = new Son();
        gf = new GranddFather();

        f.swim();
        s.swim();
        gf.swim();
    }
}