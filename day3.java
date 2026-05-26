class Animal {
    void speak() {
        System.out.println("This animal sounds like:");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Barks");
    }
}

public class day3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}