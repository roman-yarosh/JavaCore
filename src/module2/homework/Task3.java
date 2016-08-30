package module2.homework;

public class Task3 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200}; //int - такое условие домашнего задания

    public static void withdrawMoney(String ownerName, double withdrawal){
        double commision = 0.05;
        int balance = 0; //int - такое условие домашнего задания
        double balanceAfterWithdraw;
        int index = 0;

        for (String name : ownerNames){
            if (name.equals(ownerName)){
                balance = balances[index];
                break;
            }
            index++;
        }

        balanceAfterWithdraw = balance - withdrawal * (1 + commision);

        if (balanceAfterWithdraw >= 0)
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfterWithdraw);
        else System.out.println(ownerName + " NO");
    }

    public static void main(String[] args) {
        withdrawMoney("Ann", 100); // Вывод в консоль: Ann 100.0 145.0
        withdrawMoney("Oww", 490); // Вывод в консоль: Oww NO
    }

}
