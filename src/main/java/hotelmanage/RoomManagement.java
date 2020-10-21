package hotelmanage;

import javax.persistence.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

import java.util.List;

@Entity
@Table(name="RoomManagement_table")
public class RoomManagement {

    @Id @GeneratedValue
    private Integer roomNo;
    private Integer roomType;
    private String roomStatus;
    private String roomName;
    private String roomQty;
    private String roomPrice;

    @PostPersist
    public void onPostPersist(){
        RoomConditionChanged roomConditionChanged = new RoomConditionChanged();
        roomConditionChanged.setRoomNo(this.getRoomNo());
        roomConditionChanged.setRoomStatus(this.getRoomStatus());
        roomConditionChanged.setRoomName(this.getRoomName());
        BeanUtils.copyProperties(this, roomConditionChanged);

        roomConditionChanged.publishAfterCommit();
    }
    @PostUpdate
    public void onPostUpdate(){
//        if("RoomAvailable".equals(this.roomStatus)){
            System.out.println("예약가능?:"+this.roomStatus);
            RoomConditionChanged roomConditionChanged = new RoomConditionChanged();
            roomConditionChanged.setRoomNo(this.getRoomNo());
            roomConditionChanged.setRoomStatus(this.getRoomStatus());
            BeanUtils.copyProperties(this, roomConditionChanged);
            roomConditionChanged.publishAfterCommit();
            System.out.println("예약가능으로 변경");
//        }
    }

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
        this.roomStatus = roomStatus;
    }

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getRoomQty() {
        return roomQty;
    }

    public void setRoomQty(String roomQty) {
        this.roomQty = roomQty;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
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
