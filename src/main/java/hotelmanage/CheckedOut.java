
package hotelmanage;

public class CheckedOut extends AbstractEvent {

    //    private Long id;
    private Integer ReservationNumber;
    private String CustomerName;
    private Integer CustomerId;
    private String ReserveStatus;
    private Integer RoomNumber;

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
    public Integer getReservationNumber() {
        return ReservationNumber;
    }

    public void setReservationNumber(Integer ReservationNumber) {
        this.ReservationNumber = ReservationNumber;
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }
    public String getReserveStatus() {
        return ReserveStatus;
    }

    public void setReserveStatus(String ReserveStatus) {
        this.ReserveStatus = ReserveStatus;
    }
    public Integer getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(Integer RoomNumber) {
        this.RoomNumber = RoomNumber;
    }
}
