package hr;

import company.Employee;
import company.Company;

public class MainApp {
    public static void main(String[] args) {

        Company.showCompanyDetails();
        System.out.println();

        Employee e1 = new Employee(101,"Ayyan");
        e1.showEmployeeDetails();

        HR hr = new HR();
        hr.showHRAcess();

        System.out.println("Employees Count: "+ Company.companyName);

    }
}
