import java.util.Scanner;

/**
 * Created by katsiarynamashokha on 8/4/17.
 */
public class Main {
    public static void main(String[] args) {
        int numGuests = 0;

        System.out.println("Welcome to Miracle events! Let's get started with planning your event!. We need to collect some information about the event.");

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of guests");
            if (scan.hasNextInt()) {
                numGuests = scan.nextInt();
                if (numOfGuestValid(numGuests)) {
                    break;
                } else {
                    numGuests = 0;
                    System.out.println("Number of guest should be between 1 and 300");
                }
            } else {
                scan.next();
                System.out.println("Enter a  valid number please");
            }
        }

    }

    private static boolean numOfGuestValid(int numGuests) {
        return numGuests > 0 && numGuests <= 300;
    }

}

