class A {
    void display() {
        System.out.println("Hello, I am A");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("Hello, I am B");
    }
}

public class super_method {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
