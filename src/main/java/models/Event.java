package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    private int numGuests;

    public Event(int numGuests, String foodType, String beverageType, String entertainmentType) {
      this.numGuests = numGuests;

    }

    public int getNumGuests() {
        return numGuests;
    }

}
