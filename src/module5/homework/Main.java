package module5.homework;

public class Main {

    public static void main (String[] args) {
        Controller controller = new Controller();

        controller.requstRooms(500, 1, "Kyiv", "Hilton Kyiv");

        controller.requstRooms(400, 2, "Kyiv", "Natsionalny Hotel");

        controller.requstRooms(750, 3, "Kyiv", "Bontiak Hotel");

        API[] apis = controller.getApis();

        API api1 = apis[0];
        API api2 = apis[1];
        API api3 = apis[2];

        controller.check(api1, api2);
        controller.check(api2, api3);
        controller.check(api3, api1);
    }
}
