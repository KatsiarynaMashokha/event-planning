import models.Event;
import models.Event.FoodType;
import models.Event.BeverageType;
import models.Event.EntertainmentType;
import models.InputManager;

import java.util.Scanner;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();

        System.out.println("Welcome to Miracle events! Let's get started with planning your event! We need to collect some information about the event.");

        int numGuests = inputManager.validateNumberOfGuests();
        Event.FoodType foodType = inputManager.validateFoodType();
        Event.BeverageType beverageType = inputManager.validateBeverageType();
        Event.EntertainmentType entertainmentType = inputManager.validateEntertainmentType();

        Event event = new Event(numGuests, foodType, beverageType, entertainmentType);

        double totalPrice = event.calculateTotalPrice();
        System.out.printf("Your current total is $%.2f\n", totalPrice);
        double discount = event.specialOffers(inputManager.getDiscountCode());
        totalPrice -= discount;
        System.out.printf("Your discount is $%.2f\n", discount);
        System.out.printf("Your final total is $%.2f\n", totalPrice);
    }
}

