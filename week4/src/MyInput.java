import java.util.Scanner;

public class MyInput {
    public static void main(String[] args){
        String name, massage;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = myObj.next();

        System.out.println(" Please enter your age");
        age = myObj.nextInt();

        System.out.println("please enter your salary");
        salary = myObj.nextDouble();

        if(salary < 50000){
            massage = "I need another job, or roomate";
        }else if(salary >= 50000 && salary < 60000){
            massage = "not bad, but hard to survive in Seattle";
        }else if (salary >= 60000 && salary < 70000){
            massage = "salary is getting better";
        }else if (salary >= 70000 && salary < 80000){
            massage = "Almost liveable in seattle";
        }else{
    massage = "Life is good!";
        }









        System.out.println("First name: " +name);
        System.out.println(" age : " +age);
        System.out.println(" salary : " +salary);
        System.out.println("massage: " +massage);


    }
}
