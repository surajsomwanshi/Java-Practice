package Java8StreamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class empByDept {

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee(1,"suraj","IT","pune",45000),
                new Employee(2,"Avi","Finance","pune",80000),
                new Employee(3,"Tanuja","QA","Latur",75000),
                new Employee(4,"Khushi","HR","mumbai",65000),
                new Employee(5,"Nikita","IT","Solapur",55000),
                new Employee(4,"Neha","HR","satara",86000)

        );

    Map<String,Long> employees1 =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

        employees1.forEach(
                (dept,count)->
                        System.out.println(dept+":"+count)
        );

        //second-highest salary of employee

        Optional<Double> secondHighest =
                employees.stream()
                        .map(Employee::getSalary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();

        secondHighest.ifPresent(System.out::println);

    }
}
