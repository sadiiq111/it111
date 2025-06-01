package package_person;

public class person {
    // file don't have a main method
    // we will start typing fields(variables)

    String name;
    char gender;
    int  age;
    String car;

    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Costumer name: " +name);
        System.out.println("gender: "+gender);
        System.out.println("age: " +age);
        System.out.println("car: " +car);
        System.out.println("violations: " +violations);
        System.out.println("creditScore: " +creditScore);
    }
        public double getRate(double monthlyRate) {
            if (violations == true && creditScore <= 700) {
                monthlyRate = 500.00;
            } else {
                monthlyRate = 100.00;
            }
            return monthlyRate;
        }

        public double assumeGender(double adjustedRate){
            if(gender == 'M' && age <= 25){
                adjustedRate = 100;
    }else {
                adjustedRate = 0;
            }
            return adjustedRate;
    }
}
