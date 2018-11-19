package com.refugee.restroom.events.service;

import com.refugee.restroom.events.dao.EventDAO;
import com.refugee.restroom.events.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventDAO eventDAO;

    public List<Event> getEvents(){
        return eventDAO.getEvents();
    }
    public List<Event> getEventsNearMe(){
        return eventDAO.getEvents();
    }

    public List<Event> getEventsByZip(int zip , int limit){
        return eventDAO.getEventsByZip( zip );
    }



}

