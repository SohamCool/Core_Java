package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.id - emp2.id;
    }
}

class EmployeeFirstNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.firstName.compareTo(emp2.firstName);
    }
}

class EmployeeSalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        return (int) (emp2.salary - emp1.salary);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(32, "Shradda","Sonale", 40000);
        Employee e2 = new Employee(49, "Suvarna","Makashe", 39999);
        Employee e3 = new Employee(89, "Nayana","Shirsat", 50000);
        Employee e4 = new Employee(21, "Anjali","Bharambe", 80000);
        Employee e5 = new Employee(55, "Shreya","Kanade", 60000);
        Employee e6 = new Employee(42, "Rushi","Ghogare", 65000);
        Employee e7= new Employee(10, "Soham","Kulkarni", 85000);
        Employee e8 = new Employee(12, "Shubham","Kolte", 70000);
        Employee e9 = new Employee(78, "Aditya", "Mangade", 95000);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);

        System.out.println("Before sorting: ");
        System.out.println(empList);
        EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();
        Collections.sort(empList, employeeIdComparator);
        System.out.println("After sorting based on id comparator: ");
        System.out.println(empList);
        System.out.println("After sorting based on FirstName comparator: ");
        EmployeeFirstNameComparator employeeFirstNameComparator = new EmployeeFirstNameComparator();
        Collections.sort(empList, employeeFirstNameComparator);
        System.out.println(empList);

        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
        Collections.sort(empList, employeeSalaryComparator);
        System.out.println(empList);
    }
}
