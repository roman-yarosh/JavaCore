package module4.polymorphismandabstraction;

/**
 * Created by Yarosh_RA on 09.09.2016.
 */
public class HREmployee extends Employee{
    @Override
    void paySalary () {
        System.out.println("HR salary");
    }
}
