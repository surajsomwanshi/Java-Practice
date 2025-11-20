package Java8Features;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.doit(25);
        foo.doit("Suraj");
    }

    // Method overloading- same method names but different parameters
    public void doit(int age) {
        System.out.println("age :" + age);
    }

    public void doit(String name) {
        System.out.println("name :" + name);
    }
}
