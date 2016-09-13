package module5.homework;

public class DAOImpl implements DAO {

    @Override
    public Room save (Room room) {
        System.out.println(room + " was saved.");
        return room;
    }

    @Override
    public boolean delete (Room room) {
        System.out.println(room + " was deleted.");
        return true;
    }

    @Override
    public Room update (Room room) {
        System.out.println(room + " was updated.");
        return room;
    }

    @Override
    public Room findById (long id) {
        Room room;
        !!!!!!!
        System.out.println(room + " was found.");
        return room;
    }
}
