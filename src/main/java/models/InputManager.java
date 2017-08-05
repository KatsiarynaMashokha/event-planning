package models;

import java.util.Scanner;
import models.Event.FoodType;
import models.Event.BeverageType;
import models.Event.EntertainmentType;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class InputManager {
    Scanner scanner = new Scanner(System.in);

    public int validateNumberOfGuests() {
        int numGuests;
        while (true) {
            System.out.println("Enter a number of guests from 1 to 300:");
            if (scanner.hasNextInt()) {
                numGuests = scanner.nextInt();
                if (numOfGuestValid(numGuests)) {
                    break;
                } else {
                    numGuests = 0;
                    System.out.println("Number of guest should be between 1 and 300");
                }
            } else {
                scanner.next();
                System.out.println("Enter a  valid number please");
            }
        }
        return numGuests;
    }

    private static boolean numOfGuestValid(int numGuests) {
        return numGuests > 0 && numGuests <= 300;
    }

    public FoodType validateFoodType() {
        FoodType foodType = null;
        System.out.println("Please enter a food option for your event: \n* light snacks \n* dessert \n* salad bar \n* fruit bar \n* full dinner \n* own food");
        while (foodType == null) {
            String food = scanner.nextLine();
            switch (food) {
                case "light snacks":
                    foodType = FoodType.LIGHT_SNACKS;
                    break;
                case "dessert":
                    foodType = FoodType.DESSERT_ONLY;
                    break;
                case "salad bar":
                    foodType = FoodType.SALAD_BAR;
                    break;
                case "fruit bar":
                    foodType = FoodType.FRUIT_BAR;
                    break;
                case "full dinner":
                    foodType = FoodType.FULL_DINNER;
                    break;
                case "own food":
                    foodType = FoodType.CUSTOMER_OWN_FOOD;
                    break;
                default:
                    System.out.println("Please enter a food choice!");
                    break;
            }
        }
        return foodType;
    }

    public BeverageType validateBeverageType() {
        BeverageType beverageType = null;
        System.out.println("Please enter a beverage option for your event: \n* coffee and tea \n* juice bar \n* non-alcoholic beverages \n* alcoholic beverages");
        while (beverageType == null) {
            String beverage = scanner.nextLine();
            switch (beverage) {
                case "coffee and tea":
                    beverageType = BeverageType.COFFEE_AND_TEA;
                    break;
                case "juice bar":
                    beverageType = BeverageType.JUICE_BAR;
                    break;
                case "non-alcoholic beverages":
                    beverageType = BeverageType.NON_ALCOHOLIC_BEVERAGES;
                    break;
                case "alcoholic beverages":
                    beverageType = BeverageType.ALCOHOLIC_BEVERAGES_AND_SOFT_DRINKS;
                    break;
                default:
                    System.out.println("Please enter a beverage choice!");
                    break;
            }
        }
        return beverageType;
    }

    public EntertainmentType validateEntertainmentType() {
        EntertainmentType entertainmentType = null;
        System.out.println("Please enter an entertainment option for your event: \n* live music \n* dj \n* for kids \n* none");
        while (entertainmentType == null) {
            String entertainment = scanner.nextLine();
            switch (entertainment) {
                case "live music":
                    entertainmentType = EntertainmentType.LIVE_MUSIC;
                    break;
                case "dj":
                    entertainmentType = EntertainmentType.DJ;
                    break;
                case "for kids":
                    entertainmentType = EntertainmentType.FOR_KIDS;
                    break;
                case "none":
                    entertainmentType = EntertainmentType.NONE;
                    break;
                default:
                    System.out.println("Please enter an entertainment option!");
                    break;
            }
        }
        return entertainmentType;
    }
}
