class Animal {
    void displayWeight() {
        System.out.println("Berat hewan tidak diketahui.");
    }
    
    void displayWeight(double weight) {
        System.out.println("Berat hewan: " + weight + " kg.");
    }
}

class Cat extends Animal {
    @Override
    void displayWeight() {
        System.out.println("Berat kucing tidak diketahui.");
    }
    
    @Override
    void displayWeight(double weight) {
        System.out.println("Berat kucing: " + weight + " kg.");
    }
}

public class AnimalWeightTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        animal.displayWeight();          // Output: Berat hewan tidak diketahui.
        animal.displayWeight(15.5);    // Output: Berat hewan: 15.5 kg.
        
        cat.displayWeight();             // Output: Berat kuving tidak diketahui.
        cat.displayWeight(17.3);       // Output: Berat kucing: 17.3 kg.
    }
}
