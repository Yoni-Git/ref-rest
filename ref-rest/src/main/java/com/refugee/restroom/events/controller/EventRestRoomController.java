package com.refugee.restroom.events.controller;

import com.refugee.restroom.events.domain.EventRestRoom;
import com.refugee.restroom.events.service.EventRestRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This API is written for Getting Restrooms for an Event
 * Author : Yonatan
 */
//@RefreshScope
@RestController
@RequestMapping("/events")
public class EventRestRoomController {

    @Autowired
    EventRestRoomService eventRestRoomService;


    private static final Logger logger = LoggerFactory.getLogger(EventRestRoomController.class);

    @GetMapping(value="/getEventsNearMe", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<EventRestRoom> getEventsNearMe(){  return eventRestRoomService.getEventRestRoomsNearMe();
    }

    @GetMapping(value="/getEventsNearStreet/{street}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<EventRestRoom> getEventsByStreet(@PathVariable(value = "postId") String street){
        return eventRestRoomService.getEventRestRoomsNearStreet(street);
        }

    @GetMapping(value="/getEventsNearZip/{zip}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<EventRestRoom> getEventsByZip(@PathVariable(value = "zip") int zip){ return null;}

}
