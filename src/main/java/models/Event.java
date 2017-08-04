package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    public enum FoodType {LIGHT_SNACKS, DESSERT_ONLY, FULL_DINNER, SALAD_BAR, FRUIT_BAR, CUSTOMER_OWN_FOOD};
    public enum BeverageType{COFFEE_AND_TEA, JUICE_BAR, NO_ALCOHOL, ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS}
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
        double foodPricePerPerson;
        switch (foodType) {
            case LIGHT_SNACKS:
                foodPricePerPerson = 6;
                break;
            case DESSERT_ONLY:
                foodPricePerPerson = 7;
                break;
            case SALAD_BAR:
                foodPricePerPerson = 10;
                break;
            case FRUIT_BAR:
                foodPricePerPerson = 9;
                break;
            case CUSTOMER_OWN_FOOD:
                foodPricePerPerson = 2;
                break;
            case FULL_DINNER:
                foodPricePerPerson = 17;
                break;
            default:
                throw new IllegalArgumentException("Wrong choice");
        }
        return numGuests * foodPricePerPerson;
    }

    public double calculateBeveragePrice() {
        return 0;
    }


}
