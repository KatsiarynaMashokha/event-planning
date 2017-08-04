package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    private int numGuests;
    private String foodType;

    public Event(int numGuests, String foodType, String beverageType, String entertainmentType) {
      this.numGuests = numGuests;
      this.foodType = foodType;

    }

    public int getNumGuests() {
        return numGuests;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getBeverageType() {
        return null;
    }

}
