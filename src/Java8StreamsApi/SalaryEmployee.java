package Java8StreamsApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryEmployee {

    public static void main(String[] args) {
        List<Employee> employees=List.of(
                new Employee(1,"John","IT","Sweden",50000),
                new Employee(2,"Alex","HR","Norway",55000),
                new Employee(3,"Adam","Admin","denmark",60000),
                new Employee(4,"Paul","RMG","Germany",59000)
        );
        //List of employees with salary greater than 50000
        employees.stream()
                .filter(e->e.getSalary()>50000)
                .forEach(e-> System.out.println("Employee Name: "+e.getName()+", Salary: "+e.getSalary()));

        //Average salary of employees
        double avgSalary= employees.stream()
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .orElse(0.0);
        .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average Salary: "+avgSalary);

        //Group employees by department
        Map<String,List<Employee>> empByDept= employees.stream()
                .filter(d->d.getDept().equals("IT"))
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Employees by Department: "+empByDept);
    }
}
