package com.refugee.restroom.events.service;

import com.refugee.restroom.events.dao.RestRoomDAO;
import com.refugee.restroom.events.domain.RestRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestRoomService {


    @Autowired
    private RestRoomDAO restRoomDAO;


    public List<RestRoom> getEvents(){
        return restRoomDAO.getRestRooms();
    }
    public List<RestRoom> getRestRoomsNearMe(long latitude , long longitude){
        return restRoomDAO.getRestRoomsNearMe(latitude, longitude);
    }

    public List<RestRoom> getRestRoomsByStreet(String street){
        return restRoomDAO.getRestRoomsByStreet(street);
    }

}
