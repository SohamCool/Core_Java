package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int age;
    String name;
    int id;

    public Employee(int age, String name, int id) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return age - o.age;
    }
}

public class ComparableTest2 {
    public static void main(String[] args) {
        Employee j = new Employee(20, "Rushikesh", 10);
        Employee j1 = new Employee(25, "Soham", 14);
        Employee j2 = new Employee(30, "Sameer", 19);
        Employee j3 = new Employee(28, "Shreya", 15);
        Employee j4 = new Employee(26, "Shraddha", 16);
        Employee j5 = new Employee(22, "Suvarna", 1);
        List<Employee> list = new ArrayList<>();
        list.add(j);
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        list.add(j5);
        System.out.println(list);
        System.out.println("After sorting based on age: ");
        Collections.sort(list);
        System.out.println(list);
    }
}