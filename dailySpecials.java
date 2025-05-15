import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class dailySpecials {

    public static void main (String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

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

        switch (specials) {
            // my case will be the day of the week
            case "Monday":
                coffee = "Latte;";
                price = 4.95;
                break;


            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;

                break;

            case "wednesday":
                coffee = "Cappuccino";
                price = 7.95;

                break;


            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;

                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 3.95;
              break;

        }
        System.out.println(specials + "'s coffee of the day is a  " +  coffee + "  and the price will be $ " +price);
        System.out.println(" How many " + coffee + "s would you like to order?");
       quantity = input.nextInt();

        if(quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + ", so sad!");

        }else if (quantity ==1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

        } else if (quantity <15 && quantity >=10 ) {
            System.out.println(quantity + " " + coffee + " have been ordered totaling ");
            System.out.printf("$%.2f dollars", (quantity * price));
        }else {
            System.out.println("Wow! you really love this " + coffee + "! that's a big order!");
        }


        }
    }

