public class super1 {
    class Num1 {
        int x = 12;
        }
        class Num2 extends Num1 {
        int x = 5;
        void display()
        {
        System.out.println("No is : "+ x);
        }
        }
        class Main {
        public static void main(String[] args)
        {
        super1 outer = new super1();
        Num2 s = outer.new Num2();
        s.display();
        }
        }
}
