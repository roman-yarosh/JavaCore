package module4.homework;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 5000;
        else return 10000;
    }

    @Override
    double getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 0.01;
        else return 0.0;
    }

    @Override
    double getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) return 0.03;
            else return 0.05;
        } else {
            if (summ <= 1000) return 0.10;
            else return 0.11;
        }
    }

}
