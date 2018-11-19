package com.refugee.restroom.events.service;

import com.refugee.restroom.events.domain.EventRestRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventRestRoomService {

    public List<EventRestRoom> getEventRestRoomsNearMe();
    public List<EventRestRoom> getEventRestRoomsNearZip(int zip);
    public List<EventRestRoom> getEventRestRoomsNearStreet(String Street );
}







