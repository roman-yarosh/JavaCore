package module5.homework.homeworkModule7;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void printRequestedRooms(Controller controller, int price, int persons, String city, String hotel){

        ArrayList<Room> requestedRooms;

        System.out.println("Request to API for rooms: price = " + price + ", persons = " + persons + ", city = '" + city + "', hotel = '" + hotel + "'");
        requestedRooms = controller.requestRooms(price, persons, city, hotel);
        for (Room room : requestedRooms){
            System.out.println(room);
        }
        System.out.println("");
    }

    public static void printSameRooms(Set<Room> sameRooms, API api1, API api2){

        int sameCounter = 0;

        System.out.println("Check the same rooms for api = " + api1.getClass().getName() + " and api = " + api2.getClass().getName() + " with equal price, persons, cityName but not hotel name");
        for (Room room : sameRooms){
            System.out.println(room);
            sameCounter++;
        }
        System.out.println("Amount of the same rooms: " + sameCounter);
        System.out.println("");
    }

    public static void main (String[] args) {

        Controller controller = new Controller();

        printRequestedRooms(controller, 500, 1, "Kyiv", "Hilton Kyiv");
        /* System output:
        Old: Request to API for rooms: price = 500, persons = 1, city = 'Kyiv', hotel = 'Hilton Kyiv'
        Room{id=11, price=500, persons=1, dateAvailableFrom=Thu Sep 15 12:27:54 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'} was saved to DB.
        Room{id=1, price=500, persons=1, dateAvailableFrom=Thu Sep 15 12:27:54 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'} was saved to DB.
        Room{id=11, price=500, persons=1, dateAvailableFrom=Thu Sep 15 11:54:20 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'}
        Room{id=1, price=500, persons=1, dateAvailableFrom=Thu Sep 15 11:54:20 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'}


        New: Request to API for rooms: price = 500, persons = 1, city = 'Kyiv', hotel = 'Hilton Kyiv'
        Room{id=11, price=500, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'} was saved to DB.
        Room{id=1, price=500, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'} was saved to DB.
        Room{id=11, price=500, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'}
        Room{id=1, price=500, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'} */

        printRequestedRooms(controller, 400, 2, "Kyiv", "Natsionalny Hotel");
        /* System output:
        Old: Request to API for rooms: price = 400, persons = 2, city = 'Kyiv', hotel = 'Natsionalny Hotel'
        Room{id=13, price=400, persons=2, dateAvailableFrom=Thu Sep 15 12:27:54 EEST 2016, hotelName='Natsionalny Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=13, price=400, persons=2, dateAvailableFrom=Thu Sep 15 11:54:20 EEST 2016, hotelName='Natsionalny Hotel', cityName='Kyiv'}

        New: Request to API for rooms: price = 400, persons = 2, city = 'Kyiv', hotel = 'Natsionalny Hotel'
        Room{id=13, price=400, persons=2, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Natsionalny Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=13, price=400, persons=2, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Natsionalny Hotel', cityName='Kyiv'} */

        printRequestedRooms(controller, 750, 3, "Kyiv", "Bontiak Hotel");
        /* System output:
        Old: Request to API for rooms: price = 750, persons = 3, city = 'Kyiv', hotel = 'Bontiak Hotel'
        Room{id=15, price=750, persons=3, dateAvailableFrom=Thu Sep 15 12:27:54 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=10, price=750, persons=3, dateAvailableFrom=Thu Sep 15 12:27:54 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=15, price=750, persons=3, dateAvailableFrom=Thu Sep 15 11:54:20 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'}
        Room{id=10, price=750, persons=3, dateAvailableFrom=Thu Sep 15 11:54:20 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'}

        New: Request to API for rooms: price = 750, persons = 3, city = 'Kyiv', hotel = 'Bontiak Hotel'
        Room{id=15, price=750, persons=3, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=10, price=750, persons=3, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'} was saved to DB.
        Room{id=15, price=750, persons=3, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'}
        Room{id=10, price=750, persons=3, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'} */

        ArrayList<API> apis = controller.getApis();
        API api1 = apis.get(0);
        API api2 = apis.get(1);
        API api3 = apis.get(2);

        Set<Room> sameRooms;

        sameRooms = controller.check(api1, api2);
        printSameRooms(sameRooms, api1, api2);
        /* System output:
        Old: Check the same rooms for api = module5.homework.BookingComAPI and api = module5.homework.GoogleAPI with equal price, persons, cityName but not hotel name
        Room{id=11, price=500, persons=1, dateAvailableFrom=Thu Sep 15 15:21:29 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'}
        Amount of the same rooms: 1

        New: Check the same rooms for api = module5.homework.homeworkModule7.BookingComAPI and api = module5.homework.homeworkModule7.GoogleAPI with equal price, persons, cityName but not hotel name
        Room{id=11, price=500, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Hilton Kyiv', cityName='Kyiv'}
        Amount of the same rooms: 1 */

        sameRooms = controller.check(api2, api3);
        printSameRooms(sameRooms, api2, api3);
        /* System output:
        Old: Check the same rooms for api = module5.homework.GoogleAPI and api = module5.homework.TripAdvisorAPI with equal price, persons, cityName but not hotel name
        Room{id=3, price=600, persons=2, dateAvailableFrom=Thu Sep 15 15:21:29 EEST 2016, hotelName='HYATT REGENCY Kiev', cityName='Kyiv'}
        Amount of the same rooms: 1

        New: Check the same rooms for api = module5.homework.homeworkModule7.GoogleAPI and api = module5.homework.homeworkModule7.TripAdvisorAPI with equal price, persons, cityName but not hotel name
        Room{id=3, price=600, persons=2, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='HYATT REGENCY Kiev', cityName='Kyiv'}
        Amount of the same rooms: 1 */

        sameRooms = controller.check(api3, api1);
        printSameRooms(sameRooms, api3, api1);
        /* System output:
        Old: Check the same rooms for api = module5.homework.TripAdvisorAPI and api = module5.homework.BookingComAPI with equal price, persons, cityName but not hotel name
        Room{id=7, price=450, persons=1, dateAvailableFrom=Thu Sep 15 15:21:29 EEST 2016, hotelName='Fairmont Grand Hotel Kyiv', cityName='Kyiv'}
        Room{id=9, price=650, persons=2, dateAvailableFrom=Thu Sep 15 15:21:29 EEST 2016, hotelName='President Hotel', cityName='Kyiv'}
        Room{id=10, price=750, persons=3, dateAvailableFrom=Thu Sep 15 15:21:29 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'}
        Amount of the same rooms: 3

        New: Check the same rooms for api = module5.homework.homeworkModule7.TripAdvisorAPI and api = module5.homework.homeworkModule7.BookingComAPI with equal price, persons, cityName but not hotel name
        Room{id=9, price=650, persons=2, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='President Hotel', cityName='Kyiv'}
        Room{id=10, price=750, persons=3, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Bontiak Hotel', cityName='Kyiv'}
        Room{id=7, price=450, persons=1, dateAvailableFrom=Sun Oct 09 21:31:14 EEST 2016, hotelName='Fairmont Grand Hotel Kyiv', cityName='Kyiv'}
        Amount of the same rooms: 3  */
    }
}
