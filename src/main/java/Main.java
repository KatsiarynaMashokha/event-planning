import models.Event;
import models.Event.FoodType;
import models.Event.BeverageType;
import models.Event.EntertainmentType;

import java.util.Scanner;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Main {
    public static void main(String[] args) {
        int numGuests = 0;
        Event.FoodType foodType = null;

        System.out.println("Welcome to Miracle events! Let's get started with planning your event!. We need to collect some information about the event.");

        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Please enter a food option for your event: \n* light snacks \n* dessert \n* salad bar \n* fruit bar \n* full dinner \n* own food");

        while (foodType == null) {
            System.out.println("Please enter a valid food choice");
            scanner.nextLine();
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
                    break;
            }
        }

    }

    private static boolean numOfGuestValid(int numGuests) {
        return numGuests > 0 && numGuests <= 300;
    }
}

