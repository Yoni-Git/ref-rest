package com.refugee.restroom.events.service.impl;

import com.refugee.restroom.events.dao.EventDAO;
import com.refugee.restroom.events.dao.RestRoomDAO;
import com.refugee.restroom.events.domain.Event;
import com.refugee.restroom.events.domain.EventRestRoom;
import com.refugee.restroom.events.service.EventRestRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventRestRoomServiceImpl implements EventRestRoomService {
    @Autowired
    private EventDAO eventDAO;

    @Autowired
    private RestRoomDAO restRoomDAO;

    public List<EventRestRoom> getEventRestRoomsNearMe(){
        List<Event> eventsNearMe = eventDAO.getEventsNearMe();
        List<EventRestRoom> eventsRestRoomNearMe = new ArrayList<>();

        for(Event event  : eventsNearMe) {
            EventRestRoom eventRestRoom = new EventRestRoom(event , null);
            String street =  event.getStreet();
            eventRestRoom.setRestRoom(restRoomDAO.getRestRoomsByStreet(street));
        }
        return eventsRestRoomNearMe;
    }
    public List<EventRestRoom> getEventRestRoomsNearZip(int zip){
        List<Event> eventsNearMe = eventDAO.getEventsByZip(zip);
        List<EventRestRoom> eventsRestRoomNearMe = new ArrayList<>();

        for(Event event  : eventsNearMe) {
            EventRestRoom eventRestRoom = new EventRestRoom(event , null);
            double lat   =  event.getLatitude();
            double longi =  event.getLongitude();
            eventRestRoom.setRestRoom(restRoomDAO.getRestRoomsNearMe(lat, longi));
        }
        return eventsRestRoomNearMe;
    }
    public List<EventRestRoom> getEventRestRoomsNearStreet(String Street ){

        return null;
    }
}







