package company;

public class Company {
    public static String companyName;
    protected static int totalEmployee;
    static String location;
    private static final double revenue;

    static{
        companyName="TechNova Pvt Ltd";
        totalEmployee=150;
        location="Chennai";
        revenue=5000000.00;

        System.out.println("Static Block Executed: Company Initialized");
    }

    public static void showCompanyDetails(){
        System.out.println("Company Name: "+ companyName);
        System.out.println("Total Employee: "+totalEmployee);
        System.out.println("Location: "+location);
        System.out.println("Revenue: "+revenue);

    }
    protected static int getTotalEmployee(){
        return totalEmployee;
    }
    private static double getRevenue(){
        return revenue;
    }
}






















