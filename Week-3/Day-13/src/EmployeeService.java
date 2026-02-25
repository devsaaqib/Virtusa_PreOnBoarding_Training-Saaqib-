import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class EmployeeService {

    public static void main(String[] args) {

        // Supplier → Generate Random ID
        Supplier<Integer> idSupplier = () -> new Random().nextInt(1000);

        List<Employee> employees = Arrays.asList(
                new Employee(idSupplier.get(), "Ali", "IT", 50000),
                new Employee(idSupplier.get(), "Sara", "HR", 40000),
                new Employee(idSupplier.get(), "John", "IT", 60000),
                new Employee(idSupplier.get(), "Ayaan", "Finance", 45000)
        );

        // Predicate → Salary > 45000
        Predicate<Employee> highSalary =
                emp -> emp.getSalary() > 45000;

        System.out.println("---- High Salary Employees ----");

        employees.stream()
                .filter(highSalary)
                .forEach(System.out::println);

        // Function → Increase Salary by 10%
        Function<Employee, Employee> incrementSalary = emp -> {
            emp.setSalary(emp.getSalary() * 1.10);
            return emp;
        };

        System.out.println("\n---- After Salary Increment ----");

        employees.stream()
                .map(incrementSalary)
                .forEach(System.out::println);

        // Reduce → Total Salary
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("\nTotal Salary: " + totalSalary);

        // Consumer → Print Names
        Consumer<Employee> printName =
                emp -> System.out.println(emp.getName());

        System.out.println("\n---- Employee Names ----");

        employees.forEach(printName);

        // Custom Functional Interface
        SalaryIncrement customIncrement =
                salary -> salary + 5000;

        System.out.println("\n---- Custom Increment ----");

        employees.forEach(emp -> {
            emp.setSalary(customIncrement.increase(emp.getSalary()));
            System.out.println(emp);
        });
    }
}