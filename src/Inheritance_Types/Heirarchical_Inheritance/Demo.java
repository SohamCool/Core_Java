package Inheritance_Types.Heirarchical_Inheritance;
class Company{
    String companyType = "IT";
    String location = "Pune";
}
class TCS extends Company{
    String companyType = super.companyType;
    String location = super.location;
    String companyName = "TCS";
    public void DisplayCompanyDetails(){
        System.out.println("Company type: " + companyType);
        System.out.println("Company location: " + location);
        System.out.println("Company name: " + companyName);
    }
}
class Accenture extends Company{
    String companyType = super.companyType;
    String location = super.location;
    String companyName = "Accenture";
    public void DisplayCompanyDetails(){
        System.out.println("Company type: " + companyType);
        System.out.println("Company location: " + location);
        System.out.println("Company name: " + companyName);
    }
}
public class Demo {
    public static void main(String[] args) {
        Accenture obj = new Accenture();
        obj.DisplayCompanyDetails();
        TCS obj1 = new TCS();
        obj1.DisplayCompanyDetails();
    }
}