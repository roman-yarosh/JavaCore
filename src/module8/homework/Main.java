package module8.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User user1 = new User(1, "Ivan");
        User user2 = new User(2, "Petr");
        User user3 = new User(3, "Stepan");
        User user4 = new User(4, "Dima");
        User user5 = new User(5, "Max");

        List<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5));
        UserDAO userDAO = new UserDAO();

        //Select all from DB (DB is empty)
        System.out.println("Select all from DB (DB is empty): " + userDAO.getList());
        //Select all from DB (DB is empty): []

        //Add list of users to DB
        System.out.println("Add list of users  to DB: " + users);
        userDAO.saveAll(users);
        //Add list of users  to DB: [User{id=1, name='Ivan'}, User{id=2, name='Petr'}, User{id=3, name='Stepan'},
        // User{id=4, name='Dima'}, User{id=5, name='Max'}]

        //Select all from DB (DB is not empty)
        System.out.println("Select all from DB (DB is not empty): " + userDAO.getList());
        //Select all from DB (DB is not empty): [User{id=1, name='Ivan'}, User{id=2, name='Petr'}, User{id=3, name='Stepan'},
        // User{id=4, name='Dima'}, User{id=5, name='Max'}]

        //Delete user5 from DB
        System.out.println("Delete user5 from DB");
        userDAO.delete(user5);
        //Delete user5 from DB

        //Select all from DB (DB is not empty)
        System.out.println("Select all from DB (DB is not empty): " + userDAO.getList());
        //Select all from DB (DB is not empty): [User{id=1, name='Ivan'}, User{id=2, name='Petr'}, User{id=3, name='Stepan'},
        // User{id=4, name='Dima'}]

        //Save user5 to DB
        System.out.println("Save user5 to DB");
        userDAO.save(user5);
        //Save user5 to DB

        //Select all from DB (DB is not empty)
        System.out.println("Select all from DB (DB is not empty): " + userDAO.getList());
        //Select all from DB (DB is not empty): [User{id=1, name='Ivan'}, User{id=2, name='Petr'}, User{id=3, name='Stepan'},
        // User{id=4, name='Dima'}, User{id=5, name='Max'}]

        //Get user by it's long id = 5 from DB
        System.out.println("Get user by it's long id = 5 from DB: " + userDAO.get(5));
        //Get user by it's long id = 5 from DB: User{id=5, name='Max'}

        //Delete user by it's long id = 5 from DB
        System.out.println("Delete user by it's long id = 5 from DB");
        userDAO.deleteById(5);
        //Delete user by it's long id = 5 from DB

        //Select all from DB (DB is not empty)
        System.out.println("Select all from DB (DB is not empty): " + userDAO.getList());
        //Select all from DB (DB is not empty): [User{id=1, name='Ivan'}, User{id=2, name='Petr'}, User{id=3, name='Stepan'},
        // User{id=4, name='Dima'}}]

        //Delete all users (that in input list) from DB
        System.out.println("Delete all users (that in input list) from DB");
        userDAO.deleteAll(users);
        //Delete all users (that in input list) from DB

        //Select all from DB (DB is empty)
        System.out.println("Select all from DB (DB is not empty): " + userDAO.getList());
        //Select all from DB (DB is not empty): []
    }
}
