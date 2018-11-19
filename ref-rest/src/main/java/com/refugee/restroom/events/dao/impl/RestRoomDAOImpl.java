package com.refugee.restroom.events.dao.impl;

import com.refugee.restroom.events.dao.RestRoomDAO;
import com.refugee.restroom.events.domain.RestRoom;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RestRoomDAOImpl implements RestRoomDAO {


    public List<RestRoom> getRestRooms(){
        return this.getRestRoomsLocal();
    }
    public List<RestRoom> getRestRoomsByStreet(String street ){
        /**
         * Here we will not filter as we can make appropriate API Call
         */
        return  this.getRestRoomsLocal().stream()
                .filter(restRoom -> !restRoom.getStreet().equals(street))
                .collect(Collectors.toList());
    }
    public List<RestRoom> getRestRoomsNearMe(double lattitude , double longitude){

        return getRestRoomsLocal();
    }



    public List<RestRoom> getRestRoomsLocal(){
        List<RestRoom> restRooms = new ArrayList<>();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse("2018-09-09");
        } catch(Exception exception){

        }




        RestRoom restRoom = new RestRoom( 33730,
                "Punch bowl social",
                "1331 Broadway",
                "Detroit",
                "Michigan",
                true,
                true,
                "Restaurant side 2 unisex bathrooms available",
                "",
                42.3348228,
                -83.0464461,
                date,
                77002
        );
        RestRoom restRoom2= new RestRoom( 26096,
                "COBO Center/COBO Hall",
                "1 Washington Blvd",
                "Detroit",
                "Michigan",
                true,
                true,
                "South Atrium (river-side of the building) down the large staircase and directly around the right side. Labeled \\\"Family Restroom\\\"\\r\\nCan be accessed from the river-side doors or front doors.",
                "",
                42.3267754,
                -83.0464461,
                date,
                77002
        );
        RestRoom restRoom3= new RestRoom( 26096,
                "COBO Center/COBO Hall",
                "1 Washington Blvd",
                "Detroit",
                "Michigan",
                true,
                true,
                "South Atrium (river-side of the building) down the large staircase and directly around the right side. Labeled \\\"Family Restroom\\\"\\r\\nCan be accessed from the river-side doors or front doors.",
                "",
                42.3267754,
                -83.0464461,
                date,
                77002
        );

        restRooms.add(restRoom);
        restRooms.add(restRoom2);
        restRooms.add(restRoom3);


        return restRooms;

    }
}
