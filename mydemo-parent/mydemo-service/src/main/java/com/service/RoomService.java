package com.service;

import com.dao.RoomDao;
import com.entity.Room;
import com.utils.GetMapperFactory;
import com.utils.SqlSessionFactoryUtils;

import java.util.List;

/**
 * @program: mydemo-parent
 * @description:
 * @author: admin
 * @create: 2019-10-03 21:30
 **/
public class RoomService {
   private RoomDao mapper = GetMapperFactory.getMapper(RoomDao.class);
    public List<Room> getAllRoom(){
        List<Room> rooms = mapper.getAllRoom();
        return rooms;
    }

    public List<Room> getRoomPage(Integer pageNo,Integer pageSize){
        List<Room> rooms = mapper.getRoomPage(pageNo, pageSize);
        return rooms;
    }

    public int queryCount(){
       return mapper.queryCount();
    }

    public static void main(String[] args) {
        RoomService service = new RoomService();
       /* List<Room> rooms = service.getRoomPage(0,6);
        for (Room room : rooms) {
            System.out.println(room);
        }*/
        int i = service.queryCount();
        System.out.println(i);
    }
}
