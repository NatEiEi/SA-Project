import java.util.ArrayList;
import java.util.List;

public class Dormitory {
    private int DormID;
    private String DormName;
    private int postalCode;
    private String province;
    private String district;
    private String subDistrict;
    private String road;
    private String lane;
    private String houseNo;

    private Room room;

    private List<Room> allRoom = new ArrayList<Room>();

    Dormitory (int DormID , String DormName , int postalCode , String province, String district, String subDistrict, String road,String lane, String houseNo){
        this.DormID = DormID;
        this.DormName = DormName;
        this.postalCode = postalCode;
        this.province = province;
        this.district = district;
        this.subDistrict = subDistrict;
        this.road = road;
        this.lane = lane;
        this.houseNo = houseNo;

    }

    void addRoom(Room room){
        allRoom.add(room);
    }

    void showAddress(){
        System.out.println("postalCode : " + postalCode);
        System.out.println("province : " + province);
        System.out.println("district : " + district);
        System.out.println("subDistrict : " + subDistrict);
        System.out.println("road : " + road);
        System.out.println("lane : " + lane);
        System.out.println("houseNo : " + houseNo);
    }

    void showDorm(){
        System.out.println("DormID : " + DormID);
        System.out.println("DormName : " + DormName);
    }

}
