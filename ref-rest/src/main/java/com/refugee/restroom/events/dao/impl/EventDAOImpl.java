package com.refugee.restroom.events.dao.impl;

import com.refugee.restroom.events.dao.EventDAO;
import com.refugee.restroom.events.domain.Event;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository
public class EventDAOImpl implements EventDAO {

    /**
     * Mocked Data as API is to POJ Parsing needs more work
     * @return
     */

    public List<Event> getEvents(){
        return this.getEventsLocal();
    }
    public List<Event> getEventsNearMe(){
        return this.getEventsLocal();
    }

    public List<Event> getEventsByZip(int zip ){
        return this.getEventsLocal();
    }


    public List<Event> getEventsLocal(){
        List<Event> events = new ArrayList<>();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse("2018-09-09");
        } catch(Exception exception){

        }

        Event event = new Event("Georgetown Glow: Light Art Festival - Opening Night (FREE)" ,
                "Experience the sparkle of the season at Georgetown GLOW, the region's only curated exhibition of outdoor public light art installations. Set against the historic backdrop of DC's oldest neighborhood, it's a whole new way to shine. Stay tuned for an announcement of the artists and their projects, as well as additional programming and tours, coming soon!\\nThis event is FREE!\\n\\nGeorgetown GLOW Web Site:\\nhttp://www.georgetownglowdc.com/\\n \\n \\n__________________________________________________\\n \\nThis event is sponsored by the non-profit community organization Washington, DC History & Culture:\\n“bringing people together to experience the history and culture of Washington, DC.” \\n \\nFor more fun and educational programs visit us at:\\nhttps://www.Instagram.com/DCHistoryAndCulture\\nhttps://www.Facebook.com/DCHistoryAndCulture\\nhttps://www.Meetup.com/DCHistoryAndCulture\\nhttps://DCHistoryAndCulture.Eventbrite.com\\n#DCHistoryAndCulture\\n \\n \\n__________________________________________________\\n \\nRegistration: FREE and all are welcome, including children and groups. No tickets are required - just show up. By RSVP’ing you are simply signing up to receive event updates from us via email/social media, and RSVP’ing also helps us know how many people to expect.\\n \\nWeather: This event will take place rain or shine. \\n \\nMeeting Point: TBD - stay tuned for additional details.\\n \\nAdditional Questions: Anything that can’t be answered by the above event description, Google, or common sense please let us know. \\n \\n__________________________________________________\\n \\n \\nWe look forward to seeing you - thanks!\\n \\nRobert Kelleman\\nrkelleman@yahoo.com\\n202-821-6325 (text only)\\nhttps://www.linkedin.com/in/robertkelleman/\\n \\n",
                date ,
                77002,
                123.21211,
                85.122121,
                "Fannin");
        Event event2 = new Event("Georgetown Glow: Light Art Festival - Opening Night (FREE)" ,
                "Experience the sparkle of the season at Georgetown GLOW, the region's only curated exhibition of outdoor public light art installations. Set against the historic backdrop of DC's oldest neighborhood, it's a whole new way to shine. Stay tuned for an announcement of the artists and their projects, as well as additional programming and tours, coming soon!\\nThis event is FREE!\\n\\nGeorgetown GLOW Web Site:\\nhttp://www.georgetownglowdc.com/\\n \\n \\n__________________________________________________\\n \\nThis event is sponsored by the non-profit community organization Washington, DC History & Culture:\\n“bringing people together to experience the history and culture of Washington, DC.” \\n \\nFor more fun and educational programs visit us at:\\nhttps://www.Instagram.com/DCHistoryAndCulture\\nhttps://www.Facebook.com/DCHistoryAndCulture\\nhttps://www.Meetup.com/DCHistoryAndCulture\\nhttps://DCHistoryAndCulture.Eventbrite.com\\n#DCHistoryAndCulture\\n \\n \\n__________________________________________________\\n \\nRegistration: FREE and all are welcome, including children and groups. No tickets are required - just show up. By RSVP’ing you are simply signing up to receive event updates from us via email/social media, and RSVP’ing also helps us know how many people to expect.\\n \\nWeather: This event will take place rain or shine. \\n \\nMeeting Point: TBD - stay tuned for additional details.\\n \\nAdditional Questions: Anything that can’t be answered by the above event description, Google, or common sense please let us know. \\n \\n__________________________________________________\\n \\n \\nWe look forward to seeing you - thanks!\\n \\nRobert Kelleman\\nrkelleman@yahoo.com\\n202-821-6325 (text only)\\nhttps://www.linkedin.com/in/robertkelleman/\\n \\n",
                date,
                77002,
                123.21211,
                85.122121,
                "Fannin");
        Event event3 = new Event("Georgetown Glow: Light Art Festival - Opening Night (FREE)" ,
                "Experience the sparkle of the season at Georgetown GLOW, the region's only curated exhibition of outdoor public light art installations. Set against the historic backdrop of DC's oldest neighborhood, it's a whole new way to shine. Stay tuned for an announcement of the artists and their projects, as well as additional programming and tours, coming soon!\\nThis event is FREE!\\n\\nGeorgetown GLOW Web Site:\\nhttp://www.georgetownglowdc.com/\\n \\n \\n__________________________________________________\\n \\nThis event is sponsored by the non-profit community organization Washington, DC History & Culture:\\n“bringing people together to experience the history and culture of Washington, DC.” \\n \\nFor more fun and educational programs visit us at:\\nhttps://www.Instagram.com/DCHistoryAndCulture\\nhttps://www.Facebook.com/DCHistoryAndCulture\\nhttps://www.Meetup.com/DCHistoryAndCulture\\nhttps://DCHistoryAndCulture.Eventbrite.com\\n#DCHistoryAndCulture\\n \\n \\n__________________________________________________\\n \\nRegistration: FREE and all are welcome, including children and groups. No tickets are required - just show up. By RSVP’ing you are simply signing up to receive event updates from us via email/social media, and RSVP’ing also helps us know how many people to expect.\\n \\nWeather: This event will take place rain or shine. \\n \\nMeeting Point: TBD - stay tuned for additional details.\\n \\nAdditional Questions: Anything that can’t be answered by the above event description, Google, or common sense please let us know. \\n \\n__________________________________________________\\n \\n \\nWe look forward to seeing you - thanks!\\n \\nRobert Kelleman\\nrkelleman@yahoo.com\\n202-821-6325 (text only)\\nhttps://www.linkedin.com/in/robertkelleman/\\n \\n",
                date,
                77002,
                123.21211,
                85.122121,
                "Fannin");
        Event event4 = new Event("Georgetown Glow: Light Art Festival - Opening Night (FREE)" ,
                "Experience the sparkle of the season at Georgetown GLOW, the region's only curated exhibition of outdoor public light art installations. Set against the historic backdrop of DC's oldest neighborhood, it's a whole new way to shine. Stay tuned for an announcement of the artists and their projects, as well as additional programming and tours, coming soon!\\nThis event is FREE!\\n\\nGeorgetown GLOW Web Site:\\nhttp://www.georgetownglowdc.com/\\n \\n \\n__________________________________________________\\n \\nThis event is sponsored by the non-profit community organization Washington, DC History & Culture:\\n“bringing people together to experience the history and culture of Washington, DC.” \\n \\nFor more fun and educational programs visit us at:\\nhttps://www.Instagram.com/DCHistoryAndCulture\\nhttps://www.Facebook.com/DCHistoryAndCulture\\nhttps://www.Meetup.com/DCHistoryAndCulture\\nhttps://DCHistoryAndCulture.Eventbrite.com\\n#DCHistoryAndCulture\\n \\n \\n__________________________________________________\\n \\nRegistration: FREE and all are welcome, including children and groups. No tickets are required - just show up. By RSVP’ing you are simply signing up to receive event updates from us via email/social media, and RSVP’ing also helps us know how many people to expect.\\n \\nWeather: This event will take place rain or shine. \\n \\nMeeting Point: TBD - stay tuned for additional details.\\n \\nAdditional Questions: Anything that can’t be answered by the above event description, Google, or common sense please let us know. \\n \\n__________________________________________________\\n \\n \\nWe look forward to seeing you - thanks!\\n \\nRobert Kelleman\\nrkelleman@yahoo.com\\n202-821-6325 (text only)\\nhttps://www.linkedin.com/in/robertkelleman/\\n \\n",
                date ,
                77002,
                123.21211,
                85.122121,
                "Fannin");

        events.add(event);
        events.add(event2);
        events.add(event3);
        events.add(event4);

        return events;

    }
}
