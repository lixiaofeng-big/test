package com.dao;

import com.entity.Room;

import java.util.List;

/**
 * @program: mydemo-parent
 * @description:
 * @author: admin
 * @create: 2019-10-03 21:11
 **/
public interface RoomDao {
    List<Room> getAllRoom();
    List<Room> getRoomPage(Integer pageNo,Integer pageSize);
    int queryCount();
}
