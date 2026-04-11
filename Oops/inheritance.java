public class inheritance {
    static class Animal {
        void eat() {
            System.out.println("This is Animal Food");
        }
    }
    static class Dog extends Animal {
        void bark(){
            System.out.println("This Dog is Barking");
        }
    }
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        myDog.eat(); 
        myDog.bark(); 
    }
}
