class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    void sound () {
        System.out.println("Cat Meows");
    }
}

public class poly_overriding {
    public static void main (String args[]) {
        Animal a;
        a = new Animal();
        a.sound();
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}