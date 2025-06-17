import java.util.Scanner;
public class DailySpecailsExtra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String specials;
        String coffee = "";
        double price = 0;
        int quantity;


        System.out.println("Please enter a weekday, Monday - Friday");
        specials = input.next();

        boolean weekdays = false;


        while (!weekdays) {
            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
                System.out.println("You're not listening! Weekdays only!!!");
                specials = input.next();
            } else if (specials.equalsIgnoreCase("Monday") || specials.equalsIgnoreCase("Tuesday") ||
                    specials.equalsIgnoreCase("Wednesday") || specials.equalsIgnoreCase("Thursday") ||
                    specials.equalsIgnoreCase("Friday")) {
                weekdays = true;
            } else {
                System.out.println("Please enter a valid weekday name!");
                specials = input.next();
            }
        }


        specials = specials.toLowerCase();


        switch (specials) {
            case "monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "tuesday":
                coffee = "Frapp";
                price = 5.95;
                break;
            case "wednesday":
                coffee = "Cappuccino";
                price = 7.95;
                break;
            case "thursday":
                coffee = "Regular Joe";
                price = 2.00;
                break;
            case "friday":
                coffee = "Green Tea Latte";
                price = 3.95;
                break;
            default:
                System.out.println("Please enter a valid day or check your spelling and exit, and try again!");
                input.close();
                return;
        }


        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);


        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();
        double total = quantity * price;


        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + ", so sad!");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else if (quantity >= 2 && quantity <= 9) {
            System.out.println(quantity + " " + coffee + "s have been ordered and totaling");
            System.out.printf("Total: $%.2f dollars. Thank you for your order!\n", total);
        } else if (quantity >= 10 && quantity <= 15) {
            System.out.println(quantity + " " + coffee + "s have been ordered totaling");
            System.out.printf("Total: $%.2f dollars. ", total);
            System.out.println("Thank you for your big order!");
        } else {
            System.out.println("Thank you for your order.");
        }

        input.close();
    }
}
