package Final;

final class A {
    void a() {
        System.out.println("Hi this is a");
    }

    void b() {
        System.out.println("Hi this is b");
    }
}

// Cannot be extended or inherited as the class is final.

// class B extends A {
    
//     @Override
//     void a() {
//         System.out.println("Hi this is a");
//     }

//     @Override
//     void b() {
//         System.out.println("Hi this is b");
//     }

// }

public class final_class {
    public static void main(String[] args) {
        // B b = new B();
        // b.a(); b.b();
    }
}
