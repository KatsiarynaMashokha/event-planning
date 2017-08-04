package models;

import models.Event.FoodType;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsNumberOfGuests_10() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals(10, testEvent.getNumGuests());
    }

    @Test
    public void newEvent_getsFoodType_Light() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals(FoodType.SALAD_BAR, testEvent.getFoodType());
    }

    @Test
    public void newEvent_getsBeverageType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals("Juice bar", testEvent.getBeverageType());
    }

    @Test
    public void newEvent_getsEntertainmentType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals("Live band", testEvent.getEntertainmentType());
    }

    @Test
    public void newEvent_calculateGuestsPrice_100() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals(100, testEvent.calculateGuestsPrice(), 0);
    }

    @Test
    public void newEvent_calculateFoodPrice_100() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, "Juice bar", "Live band");
        assertEquals(100, testEvent.calculateFoodPrice(), 0);
    }

}