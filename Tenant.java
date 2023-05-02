public class Tenant extends User{
    private String PaymentType;
    private int PaymentNo;
    private Room room;

    Tenant(String ID , String Password , String Email , String FirstName , String LastName , int TelPhone,String PaymentType , int PaymentNo){
        super(ID,Password,Email,FirstName,LastName,TelPhone);
        this.PaymentType = PaymentType;
        this.PaymentNo = PaymentNo;
    }

    void rent(Room room){
        room.assignTenant(this);
        this.room = room;
    }

    public void showMyRoom(){
        System.out.println("Room Number : " + room.getNumber());
        System.out.println("Room Size : " + room.getSize());
        System.out.println("Room Price : " + room.getPrice());
    }

    public void cancel(){
        room.roomCancel();
        room = null;
    }



}
