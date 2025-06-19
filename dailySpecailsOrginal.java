import java.util.Scanner;

public class dailySpecailsOrginal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String specials = "";
        String coffee = "";
        double price = 0.0;
        boolean weekdays = false;


        while (!weekdays) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            specials = input.nextLine(); // THIS is the missing piece!

            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a Weekday, not weekend!");
            } else if (specials.equalsIgnoreCase("Monday") || specials.equalsIgnoreCase("Tuesday") ||
                    specials.equalsIgnoreCase("Wednesday") || specials.equalsIgnoreCase("Thursday") ||
                    specials.equalsIgnoreCase("Friday")) {
                weekdays = true;
            } else {
                System.out.println("Invalid input. Please check your spelling.");
            }
        }

// === Coffee special of the day ===
        switch (specials.toLowerCase()) {
            case "monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "tuesday":
                coffee = "Frapp";
                price = 4.95;
                break;
            case "wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;
            case "thursday":
                coffee = "Regular Joe";
                price = 1.00;
                break;
            case "friday":
                coffee = "Mocha";
                price = 3.50;
                break;
            default:
                System.out.println("Please enter a valid day.");
                input.close();
                return;
        }


        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        int quantity = input.nextInt();


        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");

        } else if (quantity == 1) {
            System.out.println("Looks like you are ordering only 1 " + coffee + " today!");

        } else if (quantity >= 5 && quantity < 10) {
            System.out.print("Look like you qualify for a 10% discount! ");
            System.out.print("You have ordered " + quantity + " " + coffee + "s, including the discount, this is your total: ");
            System.out.printf("$%.2f", (quantity * price * 0.9));
            System.out.println();
            System.out.print("You have saved ");
            System.out.printf("$%.2f", (quantity * price * 0.1));

        } else if (quantity >= 10) {
            System.out.print("Look like you qualify for a 20% discount! ");
            System.out.print("You have ordered " + quantity + " " + coffee + "s, including the discount, this is your total: ");
            System.out.printf("$%.2f", (quantity * price * 0.8));
            System.out.println();
            System.out.print("You have saved ");
            System.out.printf("$%.2f", (quantity * price * 0.2));

        } else {
            double total = quantity * price;
            System.out.print("You have ordered " +quantity+ " " + coffee + "s,  your total is:");
            System.out.printf("$%.2f", +total);
        }


        input.close();

    }
}
