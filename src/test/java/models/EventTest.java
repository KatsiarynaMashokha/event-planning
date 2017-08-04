package models;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(10, "Light", "Juice bar", "Live band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsNumberOfGuests_10() throws Exception {
        Event testEvent = new Event(10, "Light", "Juice bar", "Live band");
        assertEquals(10, testEvent.getNumGuests());
    }

    @Test
    public void newEvent_getsFoodType_Light() throws Exception {
        Event testEvent = new Event(10, "Light", "Juice bar", "Live band");
        assertEquals("Light", testEvent.getFoodType());
    }

    @Test
    public void newEvent_getsBeverageType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, "Light", "Juice bar", "Live band");
        assertEquals("Juice bar", testEvent.getBeverageType());
    }

    @Test
    public void newEvent_getsEntertainmentType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, "Light", "Juice bar", "Live band");
        assertEquals("Live band", testEvent.getEntertainmentType());
    }

}