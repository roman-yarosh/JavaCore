package module2.homework;

public class Task2 {

    public static void withdrawMoney (double balance, double withdrawal){
        double commision = 0.05;
        double balanceAfterWithdraw = balance - withdrawal * (1 + commision);

        if (balanceAfterWithdraw > 0)
          System.out.println("OK " + commision + " " + balanceAfterWithdraw);
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        withdrawMoney(100, 10); // Вывод в консоль: OK 0.05 89.5
        withdrawMoney(100, 99); // Вывод в консоль: NO
    }

}