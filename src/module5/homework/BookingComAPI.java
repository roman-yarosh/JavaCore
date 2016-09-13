package module5.homework;

import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI () {
        Room room1 = new Room(11, 560, 1, new Date(), "Ambassador Plaza", "Kyiv");
        Room room2 = new Room(12, 450, 1, new Date(), "Sofievsky Posad Hotel", "Kyiv");
        Room room3 = new Room(13, 400, 2, new Date(), "Natsionalny Hotel", "Kyiv");
        Room room4 = new Room(14, 650, 2, new Date(), "Manufactura Hotel", "Kyiv");
        Room room5 = new Room(15, 750, 3, new Date(), "Bontiak Hotel", "Kyiv");

        rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms (int price, int persons, String city, String hotel) {
        return rooms;
    }
}
