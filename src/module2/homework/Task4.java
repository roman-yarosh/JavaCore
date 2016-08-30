package module2.homework;

public class Task4 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200}; //int - такое условие домашнего задания

    public static double fundBalance(String ownerName, double fund){
        int balance = 0; //int - такое условие домашнего задания
        int index = 0;
        boolean found = false;

        for (String name : ownerNames){
            if (name.equals(ownerName)){
                balance = balances[index];
                found = true;
                break;
            }
            index++;
        }
        if (found) return balance + fund;
        else return 0;
    }

    public static void printOutput(String ownerName, double fundBalance){
        System.out.println(ownerName + " " + fundBalance);
    }

    public static void main(String[] args) {
        String ownerName = "Oww";
        double fund = 100;

        printOutput(ownerName, fundBalance(ownerName, fund)); // Вывод в консоль: Oww 600.0
    }

}
