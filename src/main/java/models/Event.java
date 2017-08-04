package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    private int numGuests;
    private String foodType;
    private String beverageType;
    private String entertainmentType;

    public Event(int numGuests, String foodType, String beverageType, String entertainmentType) {
      this.numGuests = numGuests;
      this.foodType = foodType;
      this.beverageType = beverageType;
      this.entertainmentType = entertainmentType;

    }

    public int getNumGuests() {
        return numGuests;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public String getEntertainmentType() {
        return entertainmentType;
    }

    public double calculateGuestsPrice() {
        return 0;
    }


}
