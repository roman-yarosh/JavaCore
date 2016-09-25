package module5.homework;

public class Controller {

    private API apis[] = new API[3];

    public Controller () {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public API[] getApis () {
        return apis;
    }

    public void setApis (API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){

        int requestedRoomsLength = 0;//Переменная для расчета количества элементов результирующего массива комнат
        int roomsStartIndex = 0;//Индекс, с которого начинается запись комнат в результирующий массив, после прохождения очередного API
        Room[] room;
        Room[] requestedRooms = null;
        DAO dao;

        //Находим общее количество комнат возвращаемое тремя API для создания результирующего массива
        for (API api : apis){
            room = api.findRooms(price, persons, city, hotel);
            if (room != null){
                requestedRoomsLength += room.length;
            }
        }

        //Если найдена хоть одна комната, то создаем массив для хранения комнат удовлетворяющих условиям поиска
        if (requestedRoomsLength > 0) {
            requestedRooms = new Room[requestedRoomsLength];

            //Проходим по всем API, находим комнаты удовлетворяющие условиям поиска и заполняем ими результирующий массив
            for (API api : apis) {
                room = api.findRooms(price, persons, city, hotel);
                if (room != null) {
                    System.arraycopy(room, 0, requestedRooms, roomsStartIndex, room.length);
                    /* Или копирование простым перебором
                    for (int i = 0; i < room.length; i++) {
                        requestedRooms[roomsStartIndex + i] = room[i];
                    }
                    */
                    roomsStartIndex += room.length;
                }
            }

            dao = new DAOImpl();
            for (Room room1 : requestedRooms){
                dao.save(room1);
            }
        }
        return requestedRooms;
    }

    public Room[] check(API api1, API api2){

        int sameRoomsLength = 0;//Переменная для расчета количества элементов результирующего массива одинаковых комнат
        Room[] sameRooms = null;

        for (Room room1 : api1.getAllRooms()){
            for (Room room2 : api2.getAllRooms()){
                if (room1.equals(room2)){
                    sameRoomsLength++;
                    //System.out.println(room1);
                    //System.out.println(room2);
                }
            }
        }

        if (sameRoomsLength > 0) {
            sameRooms = new Room[sameRoomsLength];
            int i = 0;
            for (Room room1 : api1.getAllRooms()){
                for (Room room2 : api2.getAllRooms()){
                    if (room1.equals(room2)){
                        sameRooms[i] = room1;
                        i++;
                    }
                }
            }
        }
        return sameRooms;
    }
}
