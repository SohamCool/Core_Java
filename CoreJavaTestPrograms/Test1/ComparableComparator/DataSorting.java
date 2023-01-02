package Test1.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollNo;
    String firstName;
    String middleName;
    String lastName;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollNo, String firstName, String middleName, String lastName, int marks) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return rollNo - o.rollNo;
    }
}

class firstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}

class middleNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.middleName.compareTo(o2.middleName);
    }
}

class lastNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}

class marksComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.marks - o1.marks;
    }
}

public class DataSorting{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10, "Suresh", "M", "Bhat", 70));
        list.add(new Student(9, "Chaitanya", "S", "Vadghare", 65));
        list.add(new Student(5, "Suryaksh", "S", "Sharma", 90));
        list.add(new Student(4, "Siddhant", "A", "Indulkar", 75));
        list.add(new Student(3, "Adinath", "D", "Kute", 55));
        list.add(new Student(2, "Shrilakshmi", "J", "Kulkarni", 95));
        list.add(new Student(1, "Veena", "R", "Sahastrabuddhe", 80));
        list.add(new Student(8, "Rahul", "V", "Deshpande", 98));
        list.add(new Student(7, "Anand", "M", "Bhate", 80));
        list.add(new Student(6, "Mahesh", "S", "Kale", 70));

        System.out.println("Sorted by roll No");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\nSorted by firstName");
        Collections.sort(list, new firstNameComparator());
        System.out.println(list);

        System.out.println("\nSorted by Middle name");
        Collections.sort(list, new middleNameComparator());
        System.out.println(list);

        System.out.println("\nSorted by Last Name");
        Collections.sort(list, new lastNameComparator());
        System.out.println(list);

        System.out.println("\nSorted by marks");
        Collections.sort(list, new marksComparator());
        System.out.println(list);
    }
}
