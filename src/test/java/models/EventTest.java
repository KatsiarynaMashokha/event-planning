package models;

import models.Event.FoodType;
import models.Event.BeverageType;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsNumberOfGuests_10() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(10, testEvent.getNumGuests());
    }

    @Test
    public void newEvent_getsFoodType_Light() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(FoodType.SALAD_BAR, testEvent.getFoodType());
    }

    @Test
    public void newEvent_getsBeverageType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(BeverageType.JUICE_BAR, testEvent.getBeverageType());
    }

    @Test
    public void newEvent_getsEntertainmentType_JuiceBar() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals("Live band", testEvent.getEntertainmentType());
    }

    @Test
    public void newEvent_calculateGuestsPrice_100() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(100, testEvent.calculateGuestsPrice(), 0);
    }

    @Test
    public void newEvent_calculateFoodPrice_10() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(10, testEvent.calculateFoodPrice(), 0);
    }

    @Test
    public void newEvent_calculateBeveragePrice_7() throws Exception {
        Event testEvent = new Event(10, FoodType.SALAD_BAR, BeverageType.JUICE_BAR, "Live band");
        assertEquals(7, testEvent.calculateBeveragePrice(), 0);
    }

}