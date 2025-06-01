package package_person;

public class personDetails {
    public static void main(String[] args) {

        person firstPerson;
        person secondPerson;

        // in the process creating an object from my person class
        firstPerson = new person();
        secondPerson = new person();

        // we will be entering the info, assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 22;
        firstPerson.car = "volkswagon Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "kendal";
        secondPerson.gender = 'M';
        secondPerson.age = 40;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;


        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();

        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");

        System.out.println("adjustments: " + firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " + firstPerson.name + "'s total monthly premium ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("adjustments: " + secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " + secondPerson.name + "'s total monthly premium ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
    }
}