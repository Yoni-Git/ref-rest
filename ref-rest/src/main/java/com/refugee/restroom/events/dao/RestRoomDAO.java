package com.refugee.restroom.events.dao;

import com.refugee.restroom.events.domain.RestRoom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestRoomDAO {


    public List<RestRoom> getRestRooms();
    public List<RestRoom> getRestRoomsByStreet(String street );
    public List<RestRoom> getRestRoomsNearMe(double lattitude , double longitude);


}
