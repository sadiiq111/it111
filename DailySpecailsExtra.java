import java.util.Scanner;

public class DailySpecailsExtra {


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String specials;

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");
        specials = input.next();


        // in the world of coffee, I need to name of a coffee beverage and a price
        String coffee = null;
        double price = 0;
        int quantity;

        boolean saturday = specials.equalsIgnoreCase("Saturday");
        boolean sunday = specials.equalsIgnoreCase("Sunday");


        while(saturday || sunday){
            System.out.println("Please enter your weekday, not weekend!");
            specials = input.next();
            saturday = specials.equalsIgnoreCase("Saturday");
            sunday = specials.equalsIgnoreCase("Sunday");
        }

      specials = specials.toLowerCase();

        switch (specials) {
            // my case will be the day of the week
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
                price = 2.95;

                break;

            case "friday":
                coffee = "Green Tea Latte";
                price = 3.95;
                break;
            default:
                System.out.println("Invalid input - please check your spelling !!!");
                return;

        }
        System.out.println(specials + "'s coffee of the day is a  " +  coffee + "  and the price will be $ " +price);
        System.out.println(" How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();
    double total = quantity * price;
        if(quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + ", so sad!");

        }else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        }else if ( quantity >=2 && quantity <= 9){
            System.out.println(quantity + " " + coffee+ " Have been ordered and totaling");
            System.out.println(price+ " dollars ! thank you for your order");
        } else if (quantity >=10 && quantity <=15) {
            System.out.println(quantity + " " + coffee + " have been ordered totaling ");
            System.out.printf(" Total: $%.2f dollars. ", total);
            System.out.println("Thank you for your big order!");
        }else {
          System.out.println(" thank you for your order.");
        }


    }
}

