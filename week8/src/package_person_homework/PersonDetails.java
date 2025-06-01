package package_person_homework;

public class PersonDetails {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

// First Person data
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 52;
        firstPerson.carYear = 2022;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

// Second Person data
        secondPerson.name = "Kendal";
        secondPerson.gender = 'M';
        secondPerson.age = 40;
        secondPerson.carYear = 2018;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

// Third Person data
        thirdPerson.name = "Sadiiq";
        thirdPerson.gender = 'M';
        thirdPerson.age = 22;
        thirdPerson.carYear = 2021;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 680;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double carRate = 0;


        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " + firstPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments (Car Year): " + firstPerson.assumeCarYear(carRate));
        System.out.print("Here is " + firstPerson.name + "'s total monthly premium: ");
        System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate) + firstPerson.assumeCarYear(carRate));
        System.out.println();


        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " + secondPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments (Car Year): " + secondPerson.assumeCarYear(carRate));
        System.out.print("Here is " + secondPerson.name + "'s total monthly premium: ");
        System.out.println(secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate) + secondPerson.assumeCarYear(carRate));
        System.out.println();


        thirdPerson.display();
        System.out.println("Preliminary Rate for " + thirdPerson.name + ": " + thirdPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " + thirdPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments (Car Year): " + thirdPerson.assumeCarYear(carRate));
        System.out.print("Here is " + thirdPerson.name + "'s total monthly premium: ");
        System.out.println(thirdPerson.getRate(monthlyRate) + thirdPerson.assumeGender(adjustedRate) + thirdPerson.assumeCarYear(carRate));
        System.out.println();
    }
}

//  this homework was a mind blowing assignment
// addition note for me, and remainding  first adjustment is age
// second adjustment is car year