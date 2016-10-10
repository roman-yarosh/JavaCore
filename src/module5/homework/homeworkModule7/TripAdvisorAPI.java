package module5.homework.homeworkModule7;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {

    private ArrayList<Room> rooms;

    public TripAdvisorAPI () {
        rooms = new ArrayList<Room>();
        rooms.add(new Room(6, 560, 1, new Date(), "Radisson Blu Hotel Kiev", "Kyiv"));
        rooms.add(new Room(7, 450, 1, new Date(), "Fairmont Grand Hotel Kyiv", "Kyiv"));
        rooms.add(new Room(8, 600, 2, new Date(), "HYATT REGENCY Kiev", "Kyiv"));
        rooms.add(new Room(9, 650, 2, new Date(), "President Hotel", "Kyiv"));
        rooms.add(new Room(10, 750, 3, new Date(), "Bontiak Hotel", "Kyiv"));
    }

    @Override
    public ArrayList<Room> getAllRooms () {
        return rooms;
    }

    @Override
    public ArrayList<Room> findRooms (int price, int persons, String city, String hotel) {

        ArrayList<Room> resultRooms = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                resultRooms.add(room);
            }
        }
        return resultRooms;    }
}
