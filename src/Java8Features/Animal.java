package Java8Features;

public class Animal {
    String name;

    public Animal() {
        super();
        this.name = "tiger";
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal name:" + animal.name);
    }
}
