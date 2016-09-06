package module3.homework.task4;

public class Main {
    public static void main (String[] args) {
        User userIvan = new User("Ivan", 1700.0, 180, "BMW", 1500.0, "USD");

        System.out.println(userIvan.toString());

        System.out.println("User name: " + userIvan.getName() + ", got salary");
        userIvan.paySalary();
        System.out.println(userIvan.toString());

        System.out.println("User name: " + userIvan.getName() + ", withdraw 100 USD: " + userIvan.withdraw(100));
        System.out.println(userIvan.toString());

        System.out.println("User name: " + userIvan.getName() + ", withdraw 1100 USD: " + userIvan.withdraw(1100));
        System.out.println(userIvan.toString());

        System.out.println("User name: " + userIvan.getName() + ", try to withdraw 2000 USD: " + userIvan.withdraw(2000));
        System.out.println(userIvan.toString());

        System.out.println("User name: " + userIvan.getName() + ", 'BMW' companyNameLength = " + userIvan.companyNameLength(userIvan.getCompanyName()));

        System.out.println("User name: " + userIvan.getName() + ", works one more month");
        userIvan.monthIncreaser(1);
        System.out.println(userIvan.toString());

        /* System output
            User{name='Ivan', balance=1700.0, monthsOfEmployment=180, companyName='BMW', salary=1500.0, currency='USD'}
            User name: Ivan, got salary
            User{name='Ivan', balance=3200.0, monthsOfEmployment=180, companyName='BMW', salary=1500.0, currency='USD'}
            User name: Ivan, withdraw 100 USD: true
            User{name='Ivan', balance=3095.0, monthsOfEmployment=180, companyName='BMW', salary=1500.0, currency='USD'}
            User name: Ivan, withdraw 1100 USD: true
            User{name='Ivan', balance=1885.0, monthsOfEmployment=180, companyName='BMW', salary=1500.0, currency='USD'}
            User name: Ivan, try to withdraw 2000 USD: false
            User{name='Ivan', balance=1885.0, monthsOfEmployment=180, companyName='BMW', salary=1500.0, currency='USD'}
            User name: Ivan, 'BMW' companyNameLength = 3
            User name: Ivan, works one more month
            User{name='Ivan', balance=1885.0, monthsOfEmployment=181, companyName='BMW', salary=1500.0, currency='USD'}
         */
    }
}
