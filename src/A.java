public class A {
    void method(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    void method() {
        System.out.println("B");
    }
}class C extends B{
    @Override
    void method() {
        System.out.println("C");
    }
}class D extends C{
    @Override
    void method() {
        System.out.println("D");
    }
}
class TestProgramme {
    public static void main(String[] args) {
        A A=new A();
        A B=new B();
        A C=new C();
        A D=new D();
        A.method();
        B.method();
        C.method();
        D.method();
    }
}