class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    @Override
    public void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
    
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.sound();
        myDog.displayBreed();
    }
}