package module5.homework;

/**
 * Created by Yarosh_RA on 13.09.2016.
 */
public class Controller {

    API apis[] = new API[3];

    public Controller () {

        API bookingComAPI = new BookingComAPI();
        API googleAPI = new GoogleAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();

        apis = new API[]{ bookingComAPI, googleAPI, tripAdvisorAPI};
    }

    public API[] getApis () {
        return apis;
    }

    public void setApis (API[] apis) {
        this.apis = apis;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel){

        for (API api : apis){

            Room[] rooms1 = api.findRooms(price, persons, city, hotel);
            Room[] rooms2 = api.findRooms(price, persons, city, hotel);
            Room[] rooms3 = api.findRooms(price, persons, city, hotel);
        }

        return rooms;
    }


    Room[] check(API api1, API api2){

        return rooms;
    }


        for (Room room : rooms){
        if (room.getPrice() == price && room.getCityName() == city && room.getHotelName().equals(hotel)){

        }
    }

}
