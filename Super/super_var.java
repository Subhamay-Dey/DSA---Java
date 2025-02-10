class A {
    int a = 100;
}

class B extends A {
    int a = 200;

    void show() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class super_var {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}