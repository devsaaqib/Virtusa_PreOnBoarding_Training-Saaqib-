import java.net.StandardSocketOptions;
import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double Sal= sc.nextDouble();


        double hra= Sal*0.20;
        double da = Sal*0.10;
        double grossSalary = Sal + hra + da;


        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary: "+Sal);
        System.out.println("HRA 20%: "+ hra);
        System.out.println(("DA 10%: "+da));
        System.out.println("Gross Salary: "+grossSalary);

        sc.close();
    }

}