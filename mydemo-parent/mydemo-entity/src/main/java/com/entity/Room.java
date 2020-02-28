package com.entity;

import java.math.BigDecimal;

/**
 * @program: mydemo-parent
 * @description:
 * @author: admin
 * @create: 2019-10-03 21:12
 **/
public class Room {
    private Integer roomId;
    private Integer roomTypeId;
    private BigDecimal roomPrice;
    private String roomDesc;
    private Integer roomStateId;
    private String roomRemark;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public Integer getRoomStateId() {
        return roomStateId;
    }

    public void setRoomStateId(Integer roomStateId) {
        this.roomStateId = roomStateId;
    }

    public String getRoomRemark() {
        return roomRemark;
    }

    public void setRoomRemark(String roomRemark) {
        this.roomRemark = roomRemark;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomTypeId=" + roomTypeId +
                ", roomPrice=" + roomPrice +
                ", roomDesc='" + roomDesc + '\'' +
                ", roomStateId=" + roomStateId +
                ", roomRemark='" + roomRemark + '\'' +
                '}';
    }

}
