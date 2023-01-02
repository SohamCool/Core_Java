package Java8_RealTimeQueries;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class EmpApp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Query 3.1 : How many male and female employees are there in the organization?
        Map<String, Long> result = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Number of male and female employees: " + result);

        // Query 3.2 : Print the name of all departments in the organization?
        System.out.println("\nDepartments in the Organization:");
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        // Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of employees: " + map);

        // Query 3.4 : Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee employee = highestPaidEmp.get();
        System.out.println("\nDetails of highest paid employee");
        System.out.println("================================");
        System.out.println("ID : " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Gender : " + employee.getGender());
        System.out.println("Department : " + employee.getDepartment());
        System.out.println("Year Of Joining : " + employee.getYearOfJoining());
        System.out.println("Salary : " + employee.getSalary());

        // Query 3.5 : Get the names of all employees who have joined after 2015?
        System.out.println("\nNames of employees who joined after 2015");
        employeeList.stream()
                .filter(e -> e.yearOfJoining > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        // Query 3.6 : Count the number of employees in each department?
        System.out.println("\nNumber of employees in each department:");
        Map deparmentEmpCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(deparmentEmpCount);
        /*for(Map.Entry<String, Integer> entry: deparmentEmpCount.entrySet())
            System.out.println(entry.getKey()+" : "+entry.getValue());*/

        // Query 3.7 : What is the average salary of each department?
        System.out.println("\nAverage salary of each department:");
        Map departmentAvgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(departmentAvgSalary);

        // Query 3.8 : Get the details of youngest male employee in the product development department?
        System.out.println("\nYoungest male employee in product development department");
        employee = employeeList.stream().filter(e -> e.gender == "Male" && e.department == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge))
                .get();
        System.out.println("\nDetails of youngest highest paid male employee");
        System.out.println("================================");
        System.out.println("ID : " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Gender : " + employee.getGender());
        System.out.println("Department : " + employee.getDepartment());
        System.out.println("Year Of Joining : " + employee.getYearOfJoining());
        System.out.println("Salary : " + employee.getSalary());

        // Query 3.9 : Who has the most working experience in the organization?
        employee = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getYearOfJoining))
                .get();

        // employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("\nDetails of employee having maximum experience in the organization");
        System.out.println("================================");
        System.out.println("ID : " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Gender : " + employee.getGender());
        System.out.println("Department : " + employee.getDepartment());
        System.out.println("Year Of Joining : " + employee.getYearOfJoining());
        System.out.println("Salary : " + employee.getSalary());

        // Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> map1 = employeeList.stream()
                .filter(e -> e.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("\nMale and female employee count in the sales and marketing team: ");
        System.out.println(map1);

        // Query 3.11 : What is the average salary of male and female employees?
        map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nAverage salary of male and female employees");
        System.out.println(map);

        // Query 3.12 : List down the names of all employees in each department?
        Map<String, List<Employee>> map2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("\nList of names of all employees in each department");
        for (Map.Entry<String, List<Employee>> entry : map2.entrySet()) {
            System.out.println("\nDepartment: " + entry.getKey());
            for (Employee emp : entry.getValue())
                System.out.println(emp.name);
        }

        // Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics salarySummary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("\nSalary summary");
        System.out.println("Average salary: " + salarySummary.getAverage());
        System.out.println("Total CTC: " + salarySummary.getSum());

        //Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> map3 = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        System.out.println("\nSeparate the employees by their age: ");
        for (Map.Entry<Boolean, List<Employee>> entry : map3.entrySet()) {
            if (entry.getKey())
                System.out.println("\nEmployees older than 25 years");
            else
                System.out.println("\nEmployees younger or equal to 25 years");
            for (Employee emp : entry.getValue())
                System.out.println(emp.getName());
        }

        // Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        employee = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .get();
        System.out.println("\nOldest employee in the organization: ");
        System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nDepartment: " + employee.getDepartment());
    }
}
