class A {
    A(int a) {
        System.out.println("Hello, I am A "+ a);
    }
}

class B extends A {
    B() {
        super(100);
        System.out.println("Hello, I am B");
    }
}

public class super_par_cons {
    public static void main(String[] args) {
        B b = new B();
    }
}