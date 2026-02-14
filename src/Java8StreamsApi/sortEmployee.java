package Java8StreamsApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class sortEmployee {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee(1,"suraj","IT","pune",45000),
                new Employee(2,"Avi","Finance","pune",80000),
                new Employee(3,"Tanuja","QA","Latur",75000),
                new Employee(4,"Khushi","HR","mumbai",65000),
                new Employee(5,"Nikita","IT","Solapur",55000),
                new Employee(4,"Neha","HR","satara",86000)

                );
        //sorting asc by salary
       List<Employee> ascEmp= employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();

       //sorting desc by salary
        List<Employee> descEmp= employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();

        ascEmp.forEach(System.out::println);
        descEmp.forEach(System.out::println);


        //highest salary from HR
       OptionalDouble highestSalary= employees.stream()
               .filter(e->e.getDept().equals("HR"))
               .mapToDouble(Employee::getSalary)
               .max();

       highestSalary.ifPresent(System.out::println);


    }
}
