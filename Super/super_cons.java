class A {
    A() {
        System.out.println("Hello, I am A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Hello, I am B");
    }
}

public class super_cons {
    public static void main(String[] args) {
        B b = new B();
    }
}
