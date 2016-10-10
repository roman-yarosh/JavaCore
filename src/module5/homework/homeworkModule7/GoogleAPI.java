package module5.homework.homeworkModule7;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {

    private ArrayList<Room> rooms;

    public GoogleAPI () {
        rooms = new ArrayList<Room>();
        rooms.add(new Room(1, 500, 1, new Date(), "Hilton Kyiv", "Kyiv"));
        rooms.add(new Room(2, 550, 1, new Date(), "Opera Hotel Kiev", "Kyiv"));
        rooms.add(new Room(3, 600, 2, new Date(), "HYATT REGENCY Kiev", "Kyiv"));
        rooms.add(new Room(4, 700, 2, new Date(), "InterContinental Kyiv", "Kyiv"));
        rooms.add(new Room(5, 800, 3, new Date(), "Premier Palace Hotel", "Kyiv"));
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
        return resultRooms;
    }
}
