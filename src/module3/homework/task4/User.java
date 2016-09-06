package module3.homework.task4;

public class User {

    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private double salary;
    private String currency;

    public User (String name, double balance, int monthsOfEmployment, String companyName, double salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary () {
        balance += salary;
    }

    public boolean withdraw(int summ){
        double commission;
        double rest;

        if (summ < 1000) {
            commission = 0.05;
        }
        else {
            commission = 0.10;
        }

        rest = balance - summ * (1 + commission);

        if (rest >= 0) {
            balance = rest;
            return true;
        }
        else return false;
    }

    public int companyNameLength(String companyName){
        return companyName.length();
    }

    public void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }

    public String getName () {
        return name;
    }

    public double getBalance () {
        return balance;
    }

    public int getMonthsOfEmployment () {
        return monthsOfEmployment;
    }

    public String getCompanyName () {
        return companyName;
    }

    public double getSalary () {
        return salary;
    }

    public String getCurrency () {
        return currency;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment (int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName (String companyName) {
        this.companyName = companyName;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void setCurrency (String currency) {
        this.currency = currency;
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", currency='" + currency + '\'' +
                '}';
    }
}
