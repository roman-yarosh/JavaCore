package module5.homework;

import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI () {
        Room room1 = new Room(6, 560, 1, new Date(), "Radisson Blu Hotel Kiev", "Kyiv");
        Room room2 = new Room(7, 450, 1, new Date(), "Fairmont Grand Hotel Kyiv", "Kyiv");
        Room room3 = new Room(8, 400, 2, new Date(), "Ramada Encore Kiev", "Kyiv");
        Room room4 = new Room(9, 650, 2, new Date(), "President Hotel", "Kyiv");
        Room room5 = new Room(10, 750, 3, new Date(), "Bontiak Hotel", "Kyiv");

        rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms (int price, int persons, String city, String hotel) {
        return rooms;
    }
}
