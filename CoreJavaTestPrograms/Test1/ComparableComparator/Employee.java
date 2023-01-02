package Test1.ComparableComparator;

public class Employee{
    int id;
    String name;
    int salary;

    @Override
    public String toString() {
        return "\n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}