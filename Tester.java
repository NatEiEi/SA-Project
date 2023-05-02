public class Tester {
    public static void main(String[] args) {
        Landlord L = new Landlord("aaa1", "abc123", "aaa1@gmail.com", "First", "Last", 076554512, 45632326);

        Dormitory D = new Dormitory(01, "helloworld", 123, "bangkok"
                        , null, null, null, null, "123");

        Room r1 = new Room(01, 22, 2000, D);
        Room r2 = new Room(02, 50, 5000 , D);

        L.addRoom(r1);
        L.addRoom(r2);

        System.out.println("Show all landlord's room");
        L.showMyRoom();

        System.out.println("\nShow detail room");
        r1.showRoom();
        System.out.println("\nShow name landlord");
        r1.showLandlord();
        System.out.println("\nShow room Address");
        r1.showAddress();
        
        
        System.out.println("\nRoom status : " + r1.rentAble());

        Tenant T = new Tenant(null, null, null, null, null, 0, null, 0);
        T.rent(r1);
        System.out.println("\nRoom status : " + r1.rentAble());
        T.showMyRoom();
        T.cancel();
        System.out.println("\nRoom status : " + r1.rentAble());
    }
}
