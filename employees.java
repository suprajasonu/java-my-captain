class Employee {
    String name;
    int yearOfJoining;
    long Salary;
    String Address; 
}
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Robert";
        e1.yearOfJoining = 1994;
        e1.Salary = 25000;
        e1.Address = "64C- WallsStreet";

         Employee e2 = new Employee();
        e2.name = "Sam";
        e2.yearOfJoining = 2000;
        e2.Salary = 100000;
        e2.Address = "68D- WallsStreet";

         Employee e3 = new Employee();
        e3.name = "John";
        e3.yearOfJoining = 1999;
        e3.Salary = 50000;
        e3.Address = "26B- WallsStreet";

        System.out.println("Name: " + e1.name);
        System.out.println("Year of Joining: " + e1.yearOfJoining);
        System.out.println("Salary: " + e1.Salary);
        System.out.println("Address: " + e1.Address);

        System.out.println("Name: " + e2.name);
        System.out.println("Year of Joining: " + e2.yearOfJoining);
        System.out.println("Salary: " + e2.Salary);
        System.out.println("Address: " + e2.Address);

        System.out.println("Name: " + e3.name);
        System.out.println("Year of Joining: " + e3.yearOfJoining);
        System.out.println("Salary: " + e3.Salary);
        System.out.println("Address: " + e3.Address);

    }

}