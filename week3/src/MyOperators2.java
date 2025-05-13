public class MyOperators2 {
    public static void main (String[] args){
        // boolean operators
//        boolean tuna = true;
//        boolean bread = false;
//        if(tuna == true &&  bread == true) {
//            System.out.println("we are having fishing!");
//
//        }else{
//            System.out.println("we are not!");
//        }

        boolean tuna = true;
        boolean bread = false;
        if(tuna == true ||  bread == true) {
            System.out.println("we are having fishing!");

        }else{
            System.out.println("we are not!");
        }
        // age - drinking age!
        int age = 18;

        if(age >= 19){
            System.out.println("yippy skippy, we can order an adult beverage!");
        }
        else{
            System.out.println("we will have a diet coke");
        }
        // amusement park roller coaster rider - smaller than 4 feet

      float height = 4F;
        if(height < 4) {
            System.out.println(" You will not be able to ride the roller coaster");
        } else {
            System.out.println("have a great time on the roller coaster");
        }


    }
}
