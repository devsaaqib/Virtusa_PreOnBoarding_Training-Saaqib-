package company;
public class Employee {
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void showEmployeeDetails(){
        System.out.println("Employee ID: "+ id);
        System.out.println("Employee Name:"+name);

        System.out.println("Company: "+ company.Company.companyName);
        System.out.println("Total Employee: "+ company.Company.totalEmployee);
        System.out.println("Location: "+ company.Company.location);
    }


}
