package module6.homework;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){
        double[] array1 = new double[]{1.0, 2.0, 3.0, 4.0};
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        double[] array3 = new double[]{1, 2, 3, 4, 5, 6};
        double[] array4 = new double[]{1, 2, 3, 4, 5, 6, 7};
        double[] array5 = new double[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(ArraysUtils.reverse(array1)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array2)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array3)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array4)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array5)));

        System.out.println("\n" + Arrays.toString(ArraysUtils.findEvenElements(array1)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array2)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array3)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array4)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array5)));

        /* System output:
        [4.0, 3.0, 2.0, 1.0]
        [5, 4, 3, 2, 1]
        [6.0, 5.0, 4.0, 3.0, 2.0, 1.0]
        [7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0]
        [8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0]

        [4.0, 2.0]
        [4, 2]
        [6.0, 4.0, 2.0]
        [6.0, 4.0, 2.0]
        [8.0, 6.0, 4.0, 2.0] */

        User user1 = new User(1,"Ivan","Ivanov",100,200);
        User user2 = new User(3,"Petr","Sverdlov",300,400);
        User user3 = new User(3,"Petr","Sverdlov",300,400);
        User user4 = null;
        User user5 = new User(2,"Stepan","Petrov",200,300);
        User[] users = {user1, user2, user3, user4, user5};

        System.out.println("\nUsers array:");
        for (User user : users){
            System.out.println(user);
        }
        /* System output:
        Users array:
        User{id=1, firstName='Ivan', lastName='Ivanov', salary=100, balance=200}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=400}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=400}
        null
        User{id=2, firstName='Stepan', lastName='Petrov', salary=200, balance=300} */

        System.out.println("\nResult unique users array:");
        for (User user : UserUtils.uniqueUsers(users)){
            System.out.println(user);
        }
        /* System output:
        Result unique users array:
        User{id=1, firstName='Ivan', lastName='Ivanov', salary=100, balance=200}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=400}
        User{id=2, firstName='Stepan', lastName='Petrov', salary=200, balance=300*/

        System.out.println("\nGet users array with balance = 400");
        for (User user : UserUtils.usersWithConditionalBalance(users, 400)){
            System.out.println(user);
        }
        /* System output:
        Get users array with balance = 400
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=400} */

        System.out.println("\nPay salary to users:");
        for (User user : UserUtils.paySalaryToUsers(users)){
            System.out.println(user);
        }
        /* System output:
        Pay salary to users:
        User{id=1, firstName='Ivan', lastName='Ivanov', salary=100, balance=300}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=700}
        User{id=2, firstName='Stepan', lastName='Petrov', salary=200, balance=500} */

        System.out.println("\nGet users id:");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        /* System output:
        Get users id:
        [1, 3, 2] */

        System.out.println("\nDelete empty users:");
        for (User user : UserUtils.deleteEmptyUsers(users)){
            System.out.println(user);
        }
        /* System output:
        Delete empty users:
        User{id=1, firstName='Ivan', lastName='Ivanov', salary=100, balance=300}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=700}
        User{id=3, firstName='Petr', lastName='Sverdlov', salary=300, balance=700}
        User{id=2, firstName='Stepan', lastName='Petrov', salary=200, balance=500} */


        System.out.println("");
        System.out.println("");

        User user10 = new User(3,"Kostya","Testov",500,800);
        User user11 = new User(4,"Stepan","Petrov",200,300);
        User user12 = new User(1,"Ivan","Ivanov",100,200);
        User user13 = new User(1,"Ivan","Ivanov",100,200);
        User user14 = new User(1,"Ivan","Ivanov",100,200);
        User[] users2 = {user10, user11, user12, user13, user14};

        System.out.println("\nSource Users array:");
        for (User user : users2){
            System.out.println(user);
        }

        System.out.println("\nTest fot uniqueUsers method:");
        for (User user : UserUtils.uniqueUsers(users2)){
            System.out.println(user);
        }


    }
}
