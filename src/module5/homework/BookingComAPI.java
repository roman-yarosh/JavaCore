package module5.homework;

import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI () {
        Room room1 = new Room(11, 500, 1, new Date(), "Hilton Kyiv", "Kyiv");
        Room room2 = new Room(12, 450, 1, new Date(), "Sofievsky Posad Hotel", "Kyiv");
        Room room3 = new Room(13, 400, 2, new Date(), "Natsionalny Hotel", "Kyiv");
        Room room4 = new Room(14, 650, 2, new Date(), "Manufactura Hotel", "Kyiv");
        Room room5 = new Room(15, 750, 3, new Date(), "Bontiak Hotel", "Kyiv");

        rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] getAllRooms () {
        return rooms;
    }

    @Override
    public Room[] findRooms (int price, int persons, String city, String hotel) {

        int foundRooms = 0;
        int i = 0;
        Room[] resultRooms;

        for (Room room : rooms){
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)){
                foundRooms++;
            }
        }

        if (foundRooms > 0) {
            resultRooms = new Room[foundRooms];
            for (Room room : rooms) {
                if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    resultRooms[i] = room;
                    i++;
                }
            }
            return resultRooms;
        } else return null;
    }
}
