package com.refugee.restroom.events.domain;

import java.util.List;

public class EventRestRoom_Depreceated {
    private String pagination;
    private List<Event> events;

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
