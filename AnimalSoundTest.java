class Animal {
    void makeSound() {
        System.out.println("Hewan mengeluarkan suara.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Anjing menggonggong.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Kucing mengiau.");
    }
}

public class AnimalSoundTest {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal1.makeSound(); // Output: Anjing menggonggong.
        animal2.makeSound(); // Output: Kucing mengiau.
    }
}
