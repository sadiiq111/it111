import java.util.Arrays;

public class MyArrays {
    public static void main (String[] args) {

        //String car = "volvo";
        String[] cars = new String[4];
        // in many computer programs, we start counting with zero

        cars[0] = "volov";
         cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";
        System.out.println(cars[2]);
        System.out.println(Arrays.toString(cars));

     //   String[] books = {"handmaid's Tale", "Slenderman", "The joy luck club", "East of Eden", "The looming Tower"};

        String[] books = new String[5];

        books[4] = "Handmaid's tale";
        books[0] = "Slenderman";
        books[1] = "The joy Luck Cluv ";
        books[2] = "East of Eden";
        books[3] = "The looming Tower";

        System.out.println(Arrays.toString(books));

// we are going to build for each loop
        for(String book : books){
            System.out.println(book);
        }

        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;
        System.out.println(Arrays.toString(numbers));
        for(int number:numbers){
            System.out.println(number);
        }
    String[] wines = new String[5];
        wines[0] = "cabernet";
        wines[1] = "MERLOT";
        wines[2] = "Syrah";
        wines[3] = "MElbec";
        wines[4] = "cabernet-Frank";

        for(String wine: wines){
            System.out.println(wine);
            System.out.println(wine.length());
        }

for(String wine : wines) {
    if (wine.equals("Syrah")) {
        break;
    }
    System.out.println(wine);

}

    }
}
