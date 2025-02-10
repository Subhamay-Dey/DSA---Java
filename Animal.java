public class Animal{
    void eat(){
     System.out.println("Eating food");
     }
    }
    class Dog extends Animal{
    void eat()
    {
     System.out.println("Eating bones ");
    }
    void display()
    {
     super.eat();
     }
    }
    class Main{
    public static void main(String args[]){
    Dog d=new Dog();
    d.display();
     }
    }