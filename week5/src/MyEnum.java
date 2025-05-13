import java.util.Scanner;

public class MyEnum {

//    enum Wines {CABERNET, MERLOT, SYRAH}

    enum WhoWins {HOME, VISITOR, NEITHER}

    public static void main (String [] args){

        // NOW I AM GOING to declare a variable

        WhoWins who;
        int seahawks, broncos;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the final score for the seahawks");
        seahawks = input.nextInt();

        System.out.println("please enter the final score for the Brancos");
        broncos = input.nextInt();

        // if the seahawks score is greater than the broncos

        if(seahawks > broncos) {
            who = WhoWins.HOME; // WhoWins.home is an object of the Whowins type
            System.out.println(who+ "team won!");
            System.out.println("seahawks win by!");
            System.out.print(seahawks - broncos+ " points");

        }else if(broncos > seahawks) {
            who = WhoWins.VISITOR; // WhoWins.home is an object of the Whowins type
            System.out.println(who+ "team won!");
            System.out.println("Broncos win by!");
            System.out.println(broncos - seahawks+ "points");
        }else{
            who = WhoWins.NEITHER; // WhoWins.home is an object of the Whowins type
            System.out.println(who+ " team won!");
        }








    }

}
