package module5.homework.homeworkModule7;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {

    private ArrayList<Room> rooms;

    public BookingComAPI () {
        rooms = new ArrayList<Room>();
        rooms.add(new Room(11, 500, 1, new Date(), "Hilton Kyiv", "Kyiv"));
        rooms.add(new Room(12, 450, 1, new Date(), "Sofievsky Posad Hotel", "Kyiv"));
        rooms.add(new Room(13, 400, 2, new Date(), "Natsionalny Hotel", "Kyiv"));
        rooms.add(new Room(14, 650, 2, new Date(), "Manufactura Hotel", "Kyiv"));
        rooms.add(new Room(15, 750, 3, new Date(), "Bontiak Hotel", "Kyiv"));
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
