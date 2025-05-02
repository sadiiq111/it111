public class GallonsLiters {
    public static void main(String[] args) {

//        *3.79 Liters = 1 Gallon

        int counter = 0;

        // Loop from 1 to 100 gallons, increment by 4

        for (int gallons = 1; gallons <= 100; gallons += 4) {
            double liters = gallons * 3.79;

              System.out.printf("%.2f Liters = %.2f Gallons%n", liters, (double) gallons);

//            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit%n", cel, far);
//            it doesn't work for me to second system.out.println'

            counter++;

            if (counter % 5 == 0) {
                System.out.println();
            }//end loop

        }
        System.out.println("we are  done!!!!");
    }
}
