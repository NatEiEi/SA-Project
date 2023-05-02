public class Tester {
    public static void main(String[] args) {
        Landlord L = new Landlord("null", "null", "null", "Name", "null", 123, 456);

        Dormitory D = new Dormitory(0, null, 0, null
                        , null, null, null, null, null);

        Room r1 = new Room(1, 2, 3 , D);
        Room r2 = new Room(4, 5, 6 , D);

        L.addRoom(r1);
        L.addRoom(r2);

        L.showMyRoom();

        System.out.println("-----------------------");
        r1.showRoom();
        r1.showLandlord();
        r1.showAddress();
        
        
        System.out.println("Room status : " + r1.rentAble());

        Tenant T = new Tenant(null, null, null, null, null, 0, null, 0);
        T.rent(r1);
        System.out.println("Room status : " + r1.rentAble());
        T.showMyRoom();
        T.cancel();
        System.out.println("Room status : " + r1.rentAble());
    }
}
