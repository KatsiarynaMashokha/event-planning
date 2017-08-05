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
        int numGuests = 0;
        Event.FoodType foodType = null;
        Event.BeverageType beverageType = null;
        Event.EntertainmentType entertainmentType = null;
        InputManager inputManager = new InputManager();

        System.out.println("Welcome to Miracle events! Let's get started with planning your event! We need to collect some information about the event.");

        numGuests = inputManager.validateNumberOfGuests();
        foodType = inputManager.validateFoodType();
        beverageType = inputManager.validateBeverageType();
        entertainmentType = inputManager.validateEntertainmentType();
    }
}

