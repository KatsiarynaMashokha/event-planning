package models;

import java.util.Scanner;
import models.Event.FoodType;

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
                    System.out.println("Please enter a food choice");
                    break;
            }
        }
        return foodType;
    }
}
