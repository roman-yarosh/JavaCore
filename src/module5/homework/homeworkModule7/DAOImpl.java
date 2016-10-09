package module5.homework.homeworkModule7;

import java.util.Date;

public class DAOImpl implements DAO {

    @Override
    public Room save (Room room) {
        System.out.println(room + " was saved to DB.");
        return room;
    }

    @Override
    public boolean delete (Room room) {
        System.out.println(room + " was deleted from DB.");
        return true;
    }

    @Override
    public Room update (Room room) {
        System.out.println(room + " was updated in DB.");
        return room;
    }

    @Override
    public Room findById (long id) {
        Room room = new Room(id, 100, 1, new Date(), "Hilton Kyiv", "Kyiv");
        System.out.println(room + " was found in DB by id = " + id);
        return room;
    }
}
