package module4.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        double withdrawal = amount * (1 + user.getBank().getCommission(amount));

        if (user.getBank().getLimitOfWithdrawal() >= withdrawal) {
            if (user.getBalance() >= withdrawal){
                user.setBalance(user.getBalance() - withdrawal);
            } else System.out.println("Not enough money to withdraw!");
        } else System.out.println("Limit of withdrawal is exceeded! Limit = " + user.getBank().getLimitOfWithdrawal() + ", withdrawal = " + withdrawal);
    }

    @Override
    public void fundUser(User user, int amount) {
        //if limit is ok - do funding - if no do nothing
        int limitOfFunding = user.getBank().getLimitOfFunding();
        if (limitOfFunding == -1 || limitOfFunding >= amount){  // -1 is no limit
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //fromUser balance - amount - commission
        //toUser balance + amount
        fromUser.setBalance(fromUser.getBalance() - amount * (1 + fromUser.getBank().getCommission(amount)));
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        //user balance + salary - commission
        user.setBalance(user.getBalance() + user.getSalary() * (1 - user.getBank().getCommission(user.getSalary())));
    }
}
