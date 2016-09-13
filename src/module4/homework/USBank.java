package module4.homework;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 1000;
        else return 1200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 10000;
        else return -1;
    }

    @Override
    double getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 0.01;
        else return 0.02;
    }

    @Override
    double getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) return 0.05;
            else return 0.07;
        } else {
            if (summ <= 1000) return 0.06;
            else return 0.08;
        }
    }

}
