package module5.homework.homeworkModule7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Controller {

    private ArrayList<API> apis;

    public Controller () {
        apis = new ArrayList<API>();
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public ArrayList<API> getApis() {
        return apis;
    }

    public void setApis(ArrayList<API> apis) {
        this.apis = apis;
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel){

        DAO dao;
        ArrayList<Room> foundRooms;
        ArrayList<Room> requestedRooms = new ArrayList<Room>();

        for (API api : apis){
            foundRooms = api.findRooms(price, persons, city, hotel);
            if (foundRooms.size() > 0 && requestedRooms.addAll(foundRooms)){
                dao = new DAOImpl();
                for (Room room : foundRooms){
                    dao.save(room);
                }
            }
        }
        return requestedRooms;
    }

    public Set<Room> check(API api1, API api2){

        Set<Room> sameRooms = new HashSet<Room>();

        for (Room room1 : api1.getAllRooms()){
            for (Room room2 : api2.getAllRooms()){
                if (room1.equals(room2)){
                    sameRooms.add(room1);
                }
            }
        }
        return sameRooms;
    }
}
