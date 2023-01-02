package Test1.ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparingNthenComparing {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(10, "Alex", 70));
        list.add(new Employee(9, "David", 65));
        list.add(new Employee(5, "Martis", 90));
        list.add(new Employee(4, "Martin", 75));
        list.add(new Employee(3, "Joe", 55));
        list.add(new Employee(2, "Bob", 95));
        list.add(new Employee(1, "Steve", 80));
        list.add(new Employee(8, "David", 98));
        list.add(new Employee(7, "Joe", 80));
        list.add(new Employee(6, "David", 70));

        System.out.println("Sorted list based on names and then salary");
        list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        System.out.println(list);
    }
}

