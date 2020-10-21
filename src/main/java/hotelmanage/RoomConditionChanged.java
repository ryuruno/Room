package hotelmanage;

public class RoomConditionChanged extends AbstractEvent {

//    private Long id;
    private Integer roomNo;
    private String roomStatus;
    private String roomName;
//    private Integer roomScore;
//    private Integer roomScoreCnt;

    public RoomConditionChanged(){
        super();
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }
    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        System.out.println("RoomManagement에 있는 setRoomStatus");
        this.roomStatus = roomStatus;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /*public Integer getRoomScore() {
        return roomScore;
    }

    public void setRoomScore(Integer roomScore) {
        this.roomScore = roomScore;
    }
    public Integer getRoomScoreCnt() {
        return roomScoreCnt;
    }

    public void setRoomScoreCnt(Integer roomScoreCnt) {
        this.roomScoreCnt = roomScoreCnt;
    }*/
}
