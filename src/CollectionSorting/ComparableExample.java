package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String firstName;
    String lastName;
    long salary;

    public Employee(int id, String firstName, String lastName, long salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp){
        return id - emp.id;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(32, "Shradda","Sonale", 40000);
        Employee e2 = new Employee(49, "Suvarna","Makashe", 39999);
        Employee e3 = new Employee(89, "Nayana","Shirsat", 50000);
        Employee e4 = new Employee(21, "Anjali","Bharambe", 80000);
        Employee e5 = new Employee(55, "Shreya","Kanade", 60000);
        Employee e6 = new Employee(42, "Rushi","Ghogare", 65000);
        Employee e7= new Employee(10, "Soham","Kulkarni", 85000);
        Employee e8 = new Employee(12, "Shubham","Kolte", 70000);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);

        System.out.println("Before sorting: ");
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println("After sorting: ");
        System.out.println(empList);
    }
}
