package package_person_homework;

public class Person {

    String name;
    char gender;
    int age;
    int carYear;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Car Year: " + carYear);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double assumeCarYear(double carRate) {
        if (carYear >= 2020) {
            carRate = 150.00;
        } else {
            carRate = 50.00;
        }
        return carRate;
    }
}


