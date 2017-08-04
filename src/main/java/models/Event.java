package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    public enum FoodType {LIGHT_SNACKS, DESSERT_ONLY, FULL_DINNER, SALAD_BAR, CUSTOMER_OWN_FOOD};
    private int numGuests;
    private FoodType foodType;
    private String beverageType;
    private String entertainmentType;

    public Event(int numGuests, FoodType foodType, String beverageType, String entertainmentType) {
      this.numGuests = numGuests;
      this.foodType = foodType;
      this.beverageType = beverageType;
      this.entertainmentType = entertainmentType;

    }

    public int getNumGuests() {
        return numGuests;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public String getEntertainmentType() {
        return entertainmentType;
    }

    public double calculateGuestsPrice() {
        return numGuests * 10;
    }

    public double calculateFoodPrice() {
        return 0;
    }


}
