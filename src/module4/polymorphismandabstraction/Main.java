package module4.polymorphismandabstraction;

/**
 * Created by Yarosh_RA on 09.09.2016.
 */
public class Main {
    public static void main (String[] args) {
        Employee[] employees = new Employee[2];
        Employee employee1 = new DeveloperEmployee();
        Employee employee2 = new HREmployee();
        employees[0] = employee1;
        employees[1] = employee2;

        for (Employee employee : employees){
            employee.paySalary();
        }

    }
}
