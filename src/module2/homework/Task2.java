package module2.homework;

public class Task2 {
    static double commision = 0.05;

    public static double withdrawBalance(double balance, double withdrawal){
        return balance - withdrawal * (1 + commision);
    }

    public static void printOutput(double balanceAfterWithdraw){
        if (balanceAfterWithdraw >= 0)
            System.out.println("OK " + commision + " " + balanceAfterWithdraw);
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        printOutput(withdrawBalance(100, 10)); // Вывод в консоль: OK 0.05 89.5
        printOutput(withdrawBalance(100, 99)); // Вывод в консоль: NO
    }

}