public class PersonRegular {
    public static void main (String[] args) {
        // to create our variables
        String firstPersonName = "Cathy";
        String secondPersonName = "Kendal";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;


        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;




        // logic in the car insurance industry - if you have traffic tickets, DUIs,other
        // violations, you will be paying more for you insurance also, if you have a
        // poor credit, you will pay more money

        if(firstPersonViolations == true && firstPersonCreditScore <= 700){
            monthlyRate1 = 500;
        }else {
            monthlyRate1 = 100;
        }
        if(secondPersonViolations == true && secondPersonCreditScore <= 700){
            monthlyRate2 = 500;
        }else {
            monthlyRate2 = 100;
        }
        // will gender and age make a difference???
        if(firstPersonAge <= 25 && firstPersonGender == 'F') {
            adjustedRate1 =100;
        }else{
            adjustedRate1 = 0;
        }
        if(secondPersonAge <= 25 && firstPersonGender == 'M') {
            adjustedRate2 = 100;
        }else{
            adjustedRate2 =0;
            double total1 = monthlyRate1 + adjustedRate1;
            double total2 = monthlyRate2 + adjustedRate2;
        }

        System.out.println("First person Name: " +firstPersonName);
        System.out.println("First person Gender: " +firstPersonGender);
        System.out.println("First person Age: " +firstPersonAge);
        System.out.println("First person Car: " +firstPersonCar);
        System.out.println("First person Violations: " +firstPersonViolations);
        System.out.println("First person Credit Score: " +firstPersonCreditScore);
        System.out.println("First person Monthly Rate1: " +monthlyRate1);
        System.out.println("First person preliminary rate: " +adjustedRate1);
        System.out.println("First person Final Monthly rate: " +monthlyRate1);
        System.out.println();

        System.out.println("second person Name: " +secondPersonName);
        System.out.println("second person Gender: " +secondPersonGender);
        System.out.println("second person Age: " +secondPersonAge);
        System.out.println("second person Car: " +secondPersonCar);
        System.out.println("second person Violations: " +secondPersonViolations);
        System.out.println("second person Monthly Rate: " +monthlyRate2 );
        System.out.println("second person Credit Score: " +secondPersonCreditScore);


    }
}
