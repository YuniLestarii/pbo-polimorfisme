class Animal {
    void displayAge() {
        System.out.println("Usia hewan tidak diketahui.");
    }
    
    void displayAge(int age) {
        System.out.println("Usia hewan: " + age + " tahun.");
    }
}

class Cat extends Animal {
    @Override
    void displayAge() {
        System.out.println("Usia kucing tidak diketahui.");
    }
    
    void displayAge(int age, String breed) {
        System.out.println("Usia kucing " + breed + ": " + age + " tahun.");
    }
}

public class AnimalAgeTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        animal.displayAge();        // Output: Usia hewan tidak diketahui.
        animal.displayAge(3);      // Output: Usia hewan: 3 tahun.
        
        cat.displayAge();           // Output: Usia kucing tidak diketahui.
        cat.displayAge(2, "anggora"); // Output: Usia kucing: 2 tahun.
    }
}
