package com.refugee.restroom.events.domain;


import java.util.List;

public class EventRestRoom {


    private Event event;
    private List<RestRoom> restRoom;


    public EventRestRoom(Event event, List<RestRoom> restRoom) {
        this.event = event;
        this.restRoom = restRoom;
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<RestRoom> getRestRoom() {
        return restRoom;
    }

    public void setRestRoom(List<RestRoom> restRoom) {
        this.restRoom = restRoom;
    }
}
