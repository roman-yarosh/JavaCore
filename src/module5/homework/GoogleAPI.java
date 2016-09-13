package module5.homework;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms;

    public GoogleAPI () {
        Room room1 = new Room(1, 500, 1, new Date(), "Hilton Kyiv", "Kyiv");
        Room room2 = new Room(2, 550, 1, new Date(), "Opera Hotel Kiev", "Kyiv");
        Room room3 = new Room(3, 600, 2, new Date(), "HYATT REGENCY Kiev", "Kyiv");
        Room room4 = new Room(4, 700, 2, new Date(), "InterContinental Kyiv", "Kyiv");
        Room room5 = new Room(5, 800, 3, new Date(), "Premier Palace Hotel", "Kyiv");

        rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms (int price, int persons, String city, String hotel) {
        return rooms;
    }
}
