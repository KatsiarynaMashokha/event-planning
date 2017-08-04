package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    public enum FoodType {LIGHT_SNACKS, DESSERT_ONLY, FULL_DINNER, SALAD_BAR, FRUIT_BAR, CUSTOMER_OWN_FOOD};
    public enum BeverageType {COFFEE_AND_TEA, JUICE_BAR, NON_ALCOHOLIC_BEVERAGES, ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS};
    public enum EntertainmentType {LIVE_MUSIC, DJ, KIDS, NONE};
    private int numGuests;
    private FoodType foodType;
    private BeverageType beverageType;
    private EntertainmentType entertainmentType;

    public Event(int numGuests, FoodType foodType, BeverageType beverageType, EntertainmentType entertainmentType) {
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

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public EntertainmentType getEntertainmentType() {
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
        return foodPricePerPerson;
    }

    public double calculateBeveragePrice() {
        double bevaragePricePerPerson;
        switch (beverageType) {
            case COFFEE_AND_TEA:
                bevaragePricePerPerson = 3;
                break;
            case JUICE_BAR:
                bevaragePricePerPerson = 7;
                break;
            case NON_ALCOHOLIC_BEVERAGES:
                bevaragePricePerPerson = 2;
                break;
            case ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS:
                bevaragePricePerPerson = 10;
                break;
            default:
                throw new IllegalArgumentException("Wrong choice");
        }
        return bevaragePricePerPerson;
    }

    public double calculateEntertainmentPrice() {
        double entertainmentPricePerPerson;
        switch (entertainmentType) {
            case LIVE_MUSIC:
                entertainmentPricePerPerson = 12;
                break;
            case DJ:
                entertainmentPricePerPerson = 7;
                break;
            case KIDS:
                entertainmentPricePerPerson = 8;
                break;
            case NONE:
                entertainmentPricePerPerson = 0;
                break;
            default:
                throw new IllegalArgumentException("Wrong choice");
        }
        return entertainmentPricePerPerson;
    }


}
