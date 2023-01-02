package Inheritance_Types.Multilevel_Inheritance;

public class MultilevelInheritance {
    String vehicleType = "Car";
    int id = 1000;
}
class ModelType extends MultilevelInheritance{
    int modelId = 101;
    String modelType = "SUV";
    String vehicleType = super.vehicleType;
}
class Company extends ModelType{
    int companyId = 11;
    String companyName = "Volkswagen";

    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company.companyId);
        System.out.println(company.companyName);
        System.out.println(company.modelId);
        System.out.println(company.modelType);
        System.out.println(company.vehicleType);
    }
}
