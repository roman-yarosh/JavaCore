package module2.homework;

public class Task3 {
    static double commision = 0.05;
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200}; //int - такое условие домашнего задания

    public static double withdrawBalance(String ownerName, double withdrawal){
        int balance = 0; //int - такое условие домашнего задания
        int index = 0;

        for (String name : ownerNames){
            if (name.equals(ownerName)){
                balance = balances[index];
                break;
            }
            index++;
        }
        return balance - withdrawal * (1 + commision);
    }

    public static void printOutput(String ownerName, double withdrawal, double balanceAfterWithdraw){
        if (balanceAfterWithdraw >= 0)
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfterWithdraw);
        else System.out.println(ownerName + " NO");
    }

    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        printOutput(ownerName, withdrawal, withdrawBalance(ownerName, withdrawal)); // Вывод в консоль: Ann 100.0 145.0

        ownerName = "Oww";
        withdrawal = 490;
        printOutput(ownerName, withdrawal, withdrawBalance(ownerName, withdrawal)); // Вывод в консоль: Oww NO
    }

}
