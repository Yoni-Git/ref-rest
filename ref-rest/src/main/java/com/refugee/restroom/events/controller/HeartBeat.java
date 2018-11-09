package com.refugee.restroom.events.controller;

import com.refugee.restroom.events.controller.Wrapper.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This API is written for API Health check
 * Author : Yonatan
 */
@RestController
@RequestMapping("/heartbeat")
public class HeartBeat {


    @Value( "${heartBeatMessage}" )
    private String heartBeatMessage;

    private static final Logger logger = LoggerFactory.getLogger(HeartBeat.class);


    @GetMapping(value="/check", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Message> check(){
        logger.info("[ com.refugee.restroom.events.controller ]  >> responding for  get  heartbeat check");
        return ResponseEntity.ok().body(new Message("Status" , heartBeatMessage));
    }

}



