import java.util.Scanner;

public class dailySpecials {
    public static void main (String[] args) {
        String specials = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();


        // in the world of coffee, I need to name of a coffee beverage and a price
        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");
        specials = input.next();

        if(saturday || sunday){
            System.out.println("Please enter your weekday, not weekend!");
        }
        switch (specials) {
            // my case will be the day of the week
            case "Monday":
                coffee = "Lattee;";
                price = 4.95;
                System.out.println(specials+",s coffee of the day is a " +coffee+ " and the price will be $" +price);
                break;

            case "Tuesday":
                coffee = "Mocha;";
                price = 5.95;
                System.out.println(specials+",s coffee of the day is a " +coffee+ " and the price will be $" +price);
                break;

            case "wednesday":
                coffee = "Cappuciono;";
                price = 7.95;
                System.out.println(specials+",s coffee of the day is a " +coffee+ " and the price will be $" +price);
                break;

            case "Thursday":
                coffee = "Regular Green;";
                price = 4.95;
                System.out.println(specials+",s coffee of the day is a " +coffee+ " and the price will be $" +price);
                break;

            case "Friday":
                coffee = "Tea;";
                price = 3.95;
                System.out.println(specials+",s coffee of the day is a " +coffee+ " and the price will be $" +price);
                break;
            default:
                System.out.println("please enter your valid date, or check your spelling");

        }


    }
}
