class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Dog: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Cat: " + name + ", Age: " + age);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Dog dog = new Dog("tommy", 5);
        Cat cat = new Cat("billo", 3);
        dog.display();
        cat.display();
    }
}
