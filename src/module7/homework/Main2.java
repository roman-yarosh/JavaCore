package module7.homework;

import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args){

        TreeSet<Order> ordersTreeSet = new TreeSet<Order>();

        User user1 = new User("Ivan", "Ivanov", "Kiev", 1000);
        User user2 = new User("Stepan", "Stepanov", "Lvov", 2000);
        User user3 = new User("Petr", "Petrov", "Dnepr", 3000);
        User user4 = new User("Sidor", "Sidorov", "Odessa", 4000);
        User user5 = new User("Dima", "Dimov", "Kharkov", 5000);
        User user6 = new User("Fedya", "Fedov", "Kiev", 6000);
        User user7 = new User("Misha", "Mishev", "Kiev", 7000);
        User user8 = new User("Max", "Maxov", "New York", 8000);
        User user9 = new User("Alex", "Alexov", "Chicago", 9000);
        User user10 = new User("Jenya", "Jenin", "Boston", 10000);

        ordersTreeSet.add(new Order(1, 10000, Currency.UAH, "HDD-c", "Hardware1", user1));
        ordersTreeSet.add(new Order(2, 1000, Currency.USD, "HDD-a", "Hardware3", user2));
        ordersTreeSet.add(new Order(3, 10200, Currency.USD, "HDD-k", "Hardware1", user3));
        ordersTreeSet.add(new Order(4, 1000, Currency.USD, "HDD-a", "Hardware2", user4));
        ordersTreeSet.add(new Order(5, 10100, Currency.UAH, "HDD-m", "Hardware1", user5));
        ordersTreeSet.add(new Order(5, 10100, Currency.UAH, "HDD-m", "Hardware1", user5));
        ordersTreeSet.add(new Order(7, 10400, Currency.USD, "HDD-s", "Hardware1", user7));
        ordersTreeSet.add(new Order(8, 1000, Currency.USD, "HDD-a", "Hardware2", user8));
        ordersTreeSet.add(new Order(4, 1000, Currency.USD, "HDD-a", "Hardware2", user4));
        ordersTreeSet.add(new Order(10, 1000, Currency.USD, "HDD-e", "Hardware4", user10));

        System.out.println("Source TreeSet of Orders:");
        for (Order order : ordersTreeSet){
            System.out.println(order);
        }
        /*Source TreeSet of Orders:
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}*/

        System.out.println("\nCheck if set contains Order where User’s lastName is - “Petrov”:");
        for (Order order : ordersTreeSet){
            String userLastName = order.getUser().getLastName();
            if (userLastName.equals("Petrov")) System.out.println("Set contains User with 'Petrov' last name: " + order);
        }
        /*Check if set contains Order where User’s lastName is - “Petrov”:
        Set contains User with 'Petrov' last name: Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}*/

        System.out.println("\nPrint Order with the largest price using only one set method - get:");
        Iterator<Order> iterator =  ordersTreeSet.iterator();
        if (iterator.hasNext()){
            System.out.println("Order with the largest price by iterator: " + iterator.next());
        }

        System.out.println("Another way to find Order with the largest price (ordersTreeSet.first()): " + ordersTreeSet.first());
        /*Print Order with the largest price using only one set method - get:
        Order with the largest price by iterator: Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}
        Another way to find Order with the largest price (ordersTreeSet.first()): Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}*/

        System.out.println("\nDelete orders where currency is USD using Iterator:");
        iterator =  ordersTreeSet.iterator();
        while (iterator.hasNext()){
            Order order = iterator.next();
            Currency orderCurrency = order.getCurrency();
            if (orderCurrency == Currency.USD) iterator.remove();
            else System.out.println(order);
        }
        /*Delete orders where currency is USD using Iterator:
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}*/
    }
}
