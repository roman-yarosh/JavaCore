package module6.homework;

public final class UserUtils {

    public static User[] uniqueUsers(User[] users){
        int i;
        int j;
        int resultLength = users.length;
        User[] result;
        boolean[] deleteSameUser = new boolean[users.length];

        //Блок последовательно сравнивает каждого пользователя со всеми только нижестоящими в массиве пользователями,
        //так как каждый вышестоящий пользователь уже сравнивался со всеми нижестоящими, то не имеет смысла
        // внутренний цикл опять запускать с первого пользователя, а запускаем его со следующего пользователя в массиве
        // после сравниваемого в первом цикле
        for (i = 0; i < users.length; i++){
            for (j = i + 1; j < users.length; j++){
                if (deleteSameUser[j] == false && users[i] != null && users[j] != null && users[i].equals(users[j])){
                    //users[j] = null; //Первый вариант решения: присваиваю null пользователю, который дублируется, но это портит исходный массив,
                    //поэтому придумал второе решение: создаю массив из boolean и устанавливаю true по индексу, по которому расположен дубль пользователя
                    deleteSameUser[j] = true;
                    resultLength--;
                }
            }
        }

        result = new User[resultLength];
        j = 0;
        for (i = 0; i < users.length; i++){
            //if (users[i] != null) result[j++] = user;// Первый вариант решения с испорченным входящим массивом пользователей
            if (!deleteSameUser[i]) result[j++] = users[i];// Второй вариант решения
        }
        return deleteEmptyUsers(result);
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
        int counter = 0;
        int j = 0;
        User[] tempUsers;

        for (User user : users){
            if (user != null && user.getBalance() == balance) counter++;
        }

        tempUsers = new User[counter];
        for (User user : users){
            if (user != null && user.getBalance() == balance) tempUsers[j++] = user;
        }
        return uniqueUsers(tempUsers);
    }

    public final static User[] paySalaryToUsers(User[] users){
        for (User user : users){
            if (user != null) user.setBalance(user.getSalary() + user.getBalance());
        }
        return uniqueUsers(users);
    }

    public final static long[] getUsersId(User[] users){
        User[] tempUsers = uniqueUsers(users);
        long[] result = new long[tempUsers.length];

        for (int i = 0; i < tempUsers.length; i++){
            result[i] = tempUsers[i].getId();
        }
        return result;
    }

    public static User[] deleteEmptyUsers(User[] users){
        int counter = 0;
        int j = 0;
        User[] tempUsers;

        for (User user : users){
            if (user != null) counter++;
        }

        tempUsers = new User[counter];
        for (User user : users){
            if (user != null) tempUsers[j++] = user;
        }
        return tempUsers;
    }
}
