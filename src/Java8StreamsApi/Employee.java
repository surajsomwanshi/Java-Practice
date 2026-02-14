package Java8StreamsApi;

public class Employee {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }

    String dept;
    String city;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    double salary;

    Employee(int id,String name,String dept,String city,double salary){
        this.id = id;
        this.name=name;
        this.dept = dept;
        this.city = city;
        this.salary = salary;
    }


}
