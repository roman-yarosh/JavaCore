package module4.homework;

public class Main {
    public static void main(String[] args){
        //Create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
        // Run four different operations with erery User’s baalance and print its objects to console.

        Bank usBank1 = new USBank(1, "USA", Currency.USD, 2000, 4500, 5000L, 5000000000L);
        Bank usBank2 = new USBank(2, "USA", Currency.USD, 3000, 5000, 6000L, 15000000000L);

        Bank euBank1 = new EUBank(3, "Germany", Currency.EUR, 1500, 3000, 4000L, 3000000000L);
        Bank euBank2 = new EUBank(4, "Germany", Currency.EUR, 2000, 3500, 4500L, 4000000000L);

        Bank chinaBank1 = new ChinaBank(5, "China", Currency.USD, 1000, 500, 600L, 700000000L);
        Bank chinaBank2 = new ChinaBank(6, "China", Currency.USD, 2000, 550, 650L, 750000000L);

        User user1 = new User(1, "Peter", 1000, 5, "Luxoft", 4500, usBank1);
        User user2 = new User(2, "Ted", 2000, 6, "City", 5000, usBank2);

        User user3 = new User(3, "Ivan", 3000, 7, "Metro", 3500, euBank1);
        User user4 = new User(4, "Greg", 4000, 8, "Tesco", 4000, euBank2);

        User user5 = new User(5, "Max", 5000, 9, "Tower", 500, chinaBank1);
        User user6 = new User(6, "Pol", 6000, 10, "Building corp.", 450, chinaBank2);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);

        /* System output
            User{id=1, name='Peter', balance=1000.0, monthsOfEmployment=5, companyName='Luxoft', salary=4500, bank=Bank{id=1, bankCountry='USA', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=4500.0, rating=5000, totalCapital=5000000000}}
            User{id=2, name='Ted', balance=2000.0, monthsOfEmployment=6, companyName='City', salary=5000, bank=Bank{id=2, bankCountry='USA', currency=USD, numberOfEmployees=3000, avrSalaryOfEmployee=5000.0, rating=6000, totalCapital=15000000000}}
            User{id=3, name='Ivan', balance=3000.0, monthsOfEmployment=7, companyName='Metro', salary=3500, bank=Bank{id=3, bankCountry='Germany', currency=EUR, numberOfEmployees=1500, avrSalaryOfEmployee=3000.0, rating=4000, totalCapital=3000000000}}
            User{id=4, name='Greg', balance=4000.0, monthsOfEmployment=8, companyName='Tesco', salary=4000, bank=Bank{id=4, bankCountry='Germany', currency=EUR, numberOfEmployees=2000, avrSalaryOfEmployee=3500.0, rating=4500, totalCapital=4000000000}}
            User{id=5, name='Max', balance=5000.0, monthsOfEmployment=9, companyName='Tower', salary=500, bank=Bank{id=5, bankCountry='China', currency=USD, numberOfEmployees=1000, avrSalaryOfEmployee=500.0, rating=600, totalCapital=700000000}}
            User{id=6, name='Pol', balance=6000.0, monthsOfEmployment=10, companyName='Building corp.', salary=450, bank=Bank{id=6, bankCountry='China', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=550.0, rating=650, totalCapital=750000000}}
         */


        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1, 500);
        System.out.println(user1); //User{id=1, name='Peter', balance=475.0, monthsOfEmployment=5, companyName='Luxoft', salary=4500, bank=Bank{id=1, bankCountry='USA', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=4500.0, rating=5000, totalCapital=5000000000}}
        bankSystem.paySalary(user1);
        System.out.println(user1);//User{id=1, name='Peter', balance=4660.0, monthsOfEmployment=5, companyName='Luxoft', salary=4500, bank=Bank{id=1, bankCountry='USA', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=4500.0, rating=5000, totalCapital=5000000000}}
        bankSystem.fundUser(user1, 500);
        System.out.println(user1);//User{id=1, name='Peter', balance=5160.0, monthsOfEmployment=5, companyName='Luxoft', salary=4500, bank=Bank{id=1, bankCountry='USA', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=4500.0, rating=5000, totalCapital=5000000000}}
        bankSystem.transferMoney(user1, user2, 500);
        System.out.println(user1);//User{id=1, name='Peter', balance=4635.0, monthsOfEmployment=5, companyName='Luxoft', salary=4500, bank=Bank{id=1, bankCountry='USA', currency=USD, numberOfEmployees=2000, avrSalaryOfEmployee=4500.0, rating=5000, totalCapital=5000000000}}
        System.out.println(user2);//User{id=2, name='Ted', balance=2500.0, monthsOfEmployment=6, companyName='City', salary=5000, bank=Bank{id=2, bankCountry='USA', currency=USD, numberOfEmployees=3000, avrSalaryOfEmployee=5000.0, rating=6000, totalCapital=15000000000}}

        bankSystem.withdrawOfUser(user2, 1500);
        System.out.println(user2);
        bankSystem.paySalary(user2);
        System.out.println(user2);
        bankSystem.fundUser(user2, 1000);
        System.out.println(user2);
        bankSystem.transferMoney(user2, user3, 1000);
        System.out.println(user2);
        System.out.println(user3);

        bankSystem.withdrawOfUser(user3, 1500);
        System.out.println(user3);
        bankSystem.paySalary(user3);
        System.out.println(user3);
        bankSystem.fundUser(user3, 1000);
        System.out.println(user3);
        bankSystem.transferMoney(user3, user4, 1000);
        System.out.println(user3);
        System.out.println(user4);

        bankSystem.withdrawOfUser(user4, 1500);
        System.out.println(user4);
        bankSystem.paySalary(user4);
        System.out.println(user4);
        bankSystem.fundUser(user4, 1000);
        System.out.println(user4);
        bankSystem.transferMoney(user4, user5, 1000);
        System.out.println(user4);
        System.out.println(user5);

        bankSystem.withdrawOfUser(user5, 1500);
        System.out.println(user5);
        bankSystem.paySalary(user5);
        System.out.println(user5);
        bankSystem.fundUser(user5, 1000);
        System.out.println(user5);
        bankSystem.transferMoney(user5, user6, 1000);
        System.out.println(user5);
        System.out.println(user6);

        bankSystem.withdrawOfUser(user6, 1500);
        System.out.println(user6);
        bankSystem.paySalary(user6);
        System.out.println(user6);
        bankSystem.fundUser(user6, 1000);
        System.out.println(user6);
        bankSystem.transferMoney(user6, user1, 1000);
        System.out.println(user6);
        System.out.println(user1);


    }
}
