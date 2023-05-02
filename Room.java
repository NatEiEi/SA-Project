public class Room {
    private int roomNumber,  roomSize ,  price; 
    private Landlord landlord;
    private Dormitory dorm;
    private Tenant tenant;

    Room(int roomNumber, int roomSize , int price )
    {
        this.roomNumber = roomNumber ;
        this.roomSize = roomSize;
        this.price = price;
    }

    Room(int roomNumber, int roomSize , int price , Dormitory dorm)
    {
        this.roomNumber = roomNumber ;
        this.roomSize = roomSize;
        this.price = price;

        this.dorm = dorm;
        dorm.addRoom(this);
    }


    public int getNumber(){
        return roomNumber;
    } 

    public int getSize(){
        return roomSize;
    } 

    public int getPrice(){
        return price;
    } 


    public void assignLandlord(Landlord landlord){
        this.landlord = landlord;
    }

    public void assignTenant(Tenant tenant){
        this.tenant = tenant;
    }


    public void showLandlord(){
        
        System.out.println(landlord.getName());
    }

    public void showRoom(){
        System.out.println("Room Number : " + getNumber());
        System.out.println("Room Size : " + getSize());
        System.out.println("Room Price : " + getPrice());
    }

    public void showAddress(){
        dorm.showAddress();
    }

    public boolean rentAble(){
        if (tenant == null){
            return true;
        }else return false;
    }

    void roomCancel(){
        tenant = null;
    }
}
