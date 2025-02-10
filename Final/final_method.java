package Final;

class A {
    void a() {
        System.out.println("Hi this is a");
    }

    final void b() {
        System.out.println("Hi this is b");
    }
}

class B extends A {
    
    @Override
    void a() {
        System.out.println("Hi this is a");
    }
    
    // Cannot Override as the method is final

    // @Override
    // void b() {
    //     System.out.println("Hi this is b");
    // }

}

public class final_method {

    public static void main(String[] args) {
        B b = new B();
        b.a(); b.b();
    }
}
