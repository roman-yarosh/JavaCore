package module7.homework;

import java.util.*;

public class Main {

    public static void main(String[] args){

        List<Order> orders = new ArrayList<Order>();

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

        orders.add(new Order(1, 10000, Currency.UAH, "HDD-c", "Hardware1", user1));
        orders.add(new Order(2, 1000, Currency.USD, "HDD-a", "Hardware3", user2));
        orders.add(new Order(3, 10200, Currency.USD, "HDD-k", "Hardware1", user3));
        orders.add(new Order(4, 1000, Currency.USD, "HDD-a", "Hardware2", user4));
        orders.add(new Order(5, 10100, Currency.UAH, "HDD-m", "Hardware1", user5));
        orders.add(new Order(6, 1000, Currency.USD, "HDD-a", "Hardware2", user6));
        orders.add(new Order(7, 10400, Currency.USD, "HDD-s", "Hardware1", user7));
        orders.add(new Order(8, 1000, Currency.USD, "HDD-a", "Hardware2", user8));
        orders.add(new Order(4, 1000, Currency.USD, "HDD-a", "Hardware2", user4));
        orders.add(new Order(10, 1000, Currency.USD, "HDD-e", "Hardware4", user10));

        System.out.println("Source orders list:");
        for (Order order : orders){
            System.out.println(order);
        }

        //В связи с тем, что я не могу поставить JDK 1.8 на свой старый ПК, а в моей 1.7 нет метода сортировки sort() в ArrayList, поэтому
        //мне пришлось сортировать лист через массив
        Order[] sortedOrders = new Order[orders.size()];
        orders.toArray(sortedOrders);

        System.out.println("\nSort list by Order price in decrease order:");
        Arrays.sort(sortedOrders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        for (int i = 0; i < sortedOrders.length; i++ ){
            orders.add(i, sortedOrders[i]);
            System.out.println(orders.get(i));
        }

        System.out.println("\nSort list by Order price in increase order AND User city:");
        Arrays.sort(sortedOrders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = o1.getPrice() - o2.getPrice();
                if (result == 0) result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return result;
            }
        });
        for (int i = 0; i < sortedOrders.length; i++ ){
            orders.add(i, sortedOrders[i]);
            System.out.println(orders.get(i));
        }

        System.out.println("\nSort list by Order itemName AND ShopIdentificator AND User city:");
        Arrays.sort(sortedOrders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = o1.getItemName().compareTo(o2.getItemName());
                if (result == 0) result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (result == 0) result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return result;
            }
        });
        for (int i = 0; i < sortedOrders.length; i++ ){
            orders.add(i, sortedOrders[i]);
            System.out.println(orders.get(i));
        }

        System.out.println("\nDelete duplicates from the list:");
        Set<Order> uniqueOrderSet = new HashSet<Order>();
        for (Order order : orders){
            uniqueOrderSet.add(order);
        }
        orders.clear();
        orders.addAll(uniqueOrderSet);
        for (Order order : orders){
            System.out.println(order);
        }

        System.out.println("\nDelete items where price less than 1500:");
        Iterator<Order> deleteIterator = orders.iterator();
        while(deleteIterator.hasNext()){
            Order order = deleteIterator.next();
            if (order.getPrice() < 1500) deleteIterator.remove();
        }
        for (Order order : orders){
            System.out.println(order);
        }

        System.out.println("\nSeparate list for two list - orders in USD and UAH:");
        List<Order> orderListUSD = new ArrayList<Order>();
        List<Order> orderListUAH = new ArrayList<Order>();
        Iterator<Order> separateIterator = orders.iterator();
        while(separateIterator.hasNext()){
            Order order = separateIterator.next();
            if (order.getCurrency() == Currency.USD) orderListUSD.add(order);
            else orderListUAH.add(order);
        }
        System.out.println("\nSeparated USD list:");
        for (Order order : orderListUSD){
            System.out.println(order);
        }
        System.out.println("\nSeparated UAH list:");
        for (Order order : orderListUAH){
            System.out.println(order);
        }

        System.out.println("\nSeparate list for as many lists as many unique cities are in User:");
        Map<String, List<Order>> cityLists = new TreeMap<String, List<Order>>();
        List<Order> currentCityList;
        String city;
        for (Order order : orders){
            city = order.getUser().getCity();
            currentCityList = cityLists.get(city);
            if (currentCityList == null) currentCityList = new ArrayList<Order>();
            currentCityList.add(order);
            cityLists.put(city, currentCityList);
        }
        for (Map.Entry<String, List<Order>> entry : cityLists.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        /*System output:

        Source orders list:
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=6, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=6, firstName='Fedya', lastName='Fedov', city='Kiev', balance=6000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}

        Sort list by Order price in decrease order:
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=6, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=6, firstName='Fedya', lastName='Fedov', city='Kiev', balance=6000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}

        Sort list by Order price in increase order AND User city:
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}
        Order{id=6, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=6, firstName='Fedya', lastName='Fedov', city='Kiev', balance=6000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}

        Sort list by Order itemName AND ShopIdentificator AND User city:
        Order{id=6, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=6, firstName='Fedya', lastName='Fedov', city='Kiev', balance=6000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}

        Delete duplicates from the list:
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=2, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware3', user=User{id=2, firstName='Stepan', lastName='Stepanov', city='Lvov', balance=2000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=8, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=8, firstName='Max', lastName='Maxov', city='New York', balance=8000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}
        Order{id=4, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=4, firstName='Sidor', lastName='Sidorov', city='Odessa', balance=4000}}
        Order{id=10, price=1000, currency=USD, itemName='HDD-e', shopIdentificator='Hardware4', user=User{id=10, firstName='Jenya', lastName='Jenin', city='Boston', balance=10000}}
        Order{id=6, price=1000, currency=USD, itemName='HDD-a', shopIdentificator='Hardware2', user=User{id=6, firstName='Fedya', lastName='Fedov', city='Kiev', balance=6000}}

        Delete items where price less than 1500:
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}

        Separate list for two list - orders in USD and UAH:

        Separated USD list:
        Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}
        Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}

        Separated UAH list:
        Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}
        Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}}

        Separate list for as many lists as many unique cities are in User:
        Dnepr [Order{id=3, price=10200, currency=USD, itemName='HDD-k', shopIdentificator='Hardware1', user=User{id=3, firstName='Petr', lastName='Petrov', city='Dnepr', balance=3000}}]
        Kharkov [Order{id=5, price=10100, currency=UAH, itemName='HDD-m', shopIdentificator='Hardware1', user=User{id=5, firstName='Dima', lastName='Dimov', city='Kharkov', balance=5000}}]
        Kiev [Order{id=1, price=10000, currency=UAH, itemName='HDD-c', shopIdentificator='Hardware1', user=User{id=1, firstName='Ivan', lastName='Ivanov', city='Kiev', balance=1000}},
              Order{id=7, price=10400, currency=USD, itemName='HDD-s', shopIdentificator='Hardware1', user=User{id=7, firstName='Misha', lastName='Mishev', city='Kiev', balance=7000}}]
        */
    }
}
