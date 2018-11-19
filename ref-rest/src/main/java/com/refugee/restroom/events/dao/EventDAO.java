package com.refugee.restroom.events.dao;

import com.refugee.restroom.events.domain.Event;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDAO {

    /**
     * Mocked Data as API is to POJ Parsing needs more work
     * @return
     */

    public List<Event> getEvents();

    public List<Event> getEventsNearMe();

    public List<Event> getEventsByZip(int zip );


}
