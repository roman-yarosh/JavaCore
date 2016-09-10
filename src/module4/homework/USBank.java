package module4.homework;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getLimitOfFunding() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getMonthlyRate() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getCommission(int summ) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }


  /*
    @Override
    public String toString() {
        return "Bank{" +
                "id=" + super.getId() +
                ", bankCountry=" + super.getBankCountry() +
                ", currency=" + super.getCurrency() +
                ", numberOfEmployees=" + super.getNumberOfEmployees() +
                ", avrSalaryOfEmployee=" + super.getAvrSalaryOfEmployee() +
                ", rating=" + super.getRating() +
                ", totalCapital=" + super.getTotalCapital() +
                '}';
    }
    */
}
