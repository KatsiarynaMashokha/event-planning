package models;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Event {
    public enum FoodType {
        LIGHT_SNACKS, DESSERT_ONLY, FULL_DINNER, SALAD_BAR, FRUIT_BAR, CUSTOMER_OWN_FOOD;
        String value() {
            switch (this) {
                case FULL_DINNER:
                    return "full dinner";
                case LIGHT_SNACKS:
                    return "light snacks";
                case SALAD_BAR:
                    return "salad bar";
                case FRUIT_BAR:
                    return "fruit bar";
                case CUSTOMER_OWN_FOOD:
                    return "own food";
                default:
                    return "no choice";
            }
        }
    }

    public enum BeverageType {
        COFFEE_AND_TEA, JUICE_BAR, NON_ALCOHOLIC_BEVERAGES, ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS;
        String value() {
            switch (this) {
                case COFFEE_AND_TEA:
                    return "cofee and tea";
                case JUICE_BAR:
                    return "juice bar";
                case ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS:
                    return "alcoholic bevarages and soft drinks";
                case NON_ALCOHOLIC_BEVERAGES:
                    return "non-alcoholic beverages";
                default:
                    return "no choice made";
            }
        }

    }

    public enum EntertainmentType {
        LIVE_MUSIC, DJ, FOR_KIDS, NONE;
        String value() {
            switch (this) {
                case LIVE_MUSIC:
                    return "live music";
                case DJ:
                    return "dj";
                case FOR_KIDS:
                    return "for kids";
                case NONE:
                    return "none";
                default:
                    return "no choice";
            }
        }
    }


    private int numGuests;
    private FoodType foodType;
    private BeverageType beverageType;
    private EntertainmentType entertainmentType;
    private int defaultNumberOfGuests = 1;

    public Event(int numGuests, FoodType foodType, BeverageType beverageType, EntertainmentType entertainmentType) {
        if (numGuests <= 0 || numGuests > 300) {
            this.numGuests = defaultNumberOfGuests;
        }
        this.numGuests = numGuests;
        this.foodType = foodType;
        this.beverageType = beverageType;
        this.entertainmentType = entertainmentType;
    }

    public void setEntertainmentType(EntertainmentType entertainmentType) {
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
            case FOR_KIDS:
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

    public double calculateTotalPrice() {
        return numGuests * (calculateFoodPrice() + calculateBeveragePrice() + calculateEntertainmentPrice());
    }

    @Override
    public String toString() {
        return "Here is your event details: " +
                "number of guests is : " + numGuests +
                " people, food choice is " + foodType.value() +
                ", beverage choice is " + beverageType.value() +
                ", entertainment option is " + entertainmentType.value();
    }

    public double specialOffers(String couponCode) {
        double discount = 0;
        if (numGuests >= 150 && foodType == FoodType.FULL_DINNER && beverageType == BeverageType.ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS) {
            if (couponCode.equals("FREEDJ")) {
                setEntertainmentType(EntertainmentType.DJ);
                System.out.println("You got free DJ services!");
            }
        } else if (numGuests >= 10 && foodType == FoodType.FULL_DINNER && entertainmentType == EntertainmentType.LIVE_MUSIC) {
            if (couponCode.equals("SAVE40")) {
                discount = 40;
            }
        } else if (couponCode.equals("q")) {
            System.out.println("No code entered.");
        } else {
            System.out.println("Not a valid coupon code.");
        }
        return discount;
    }
}
