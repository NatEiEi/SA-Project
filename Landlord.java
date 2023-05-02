import java.util.ArrayList;
import java.util.List;

public class Landlord extends User{
    private int IDCard;
    private List<Room> allRoom = new ArrayList<Room>();
    private Room room;

    Landlord(String ID , String Password , String Email , String FirstName , String LastName , int TelPhone , int IDCard){
        super(ID,Password,Email,FirstName,LastName,TelPhone);
        this.IDCard = IDCard;
    }

    // void setIDCard(int IDCard){
    //     this.IDCard = IDCard;
    // }
    // int getIDCard(int IDCard){
    //     return IDCard;
    // }
    
    void addRoom(Room room){
        room.assignLandlord(this);
        allRoom.add(room);
    }



    public void showMyRoom(){
        for (Room room : allRoom) {
            System.out.println("Room Number : " + room.getNumber());
            System.out.println("Room Size : " + room.getSize());
            System.out.println("Room Price : " + room.getPrice());
        }
    }
    
    String getName(){
        return FirstName;
    }

}
