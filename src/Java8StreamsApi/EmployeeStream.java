package Java8StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {
        List<EmployeeOne> emp = Arrays.asList(
                new EmployeeOne(1,"ABC",30,"Male",50000),
                new EmployeeOne(2,"DEF",35,"Female",80000),
                new EmployeeOne(3,"GHI",26,"Male",30000));
        //Count male and female from employee
        Map<String,Long> count=emp.stream()
                .collect(Collectors.groupingBy(EmployeeOne::getGender,Collectors.counting()));

        System.out.println(count);

        //Average salary by gender
        Map<String,Double> avgSalary=emp.stream()
                .collect(Collectors.groupingBy(
                        EmployeeOne::getGender,
                        Collectors.averagingDouble(EmployeeOne::getSalary)
                ));
        System.out.println(avgSalary);
    }
}
