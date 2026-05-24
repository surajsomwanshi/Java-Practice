package InterviewPreparation;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Exp3 {


    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(12,"Amit"));
        list.add(new Employee(13,"Rahul"));
        list.add(new Employee(15,"Ankit"));
        list.stream()
                .filter(e -> e.getName().startsWith("A"))
                .forEach(e -> {
                    e.setAge(e.getAge() * 2);
                    System.out.println(e.getName());
                });

    }
}
