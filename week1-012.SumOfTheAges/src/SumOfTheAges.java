import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Let's find out an age sum of two people!");
        
        System.out.println("Type your name:"); 
        String firstName = reader.nextLine();
        
        System.out.println("Type your age:");
        int firstAge = Integer. parseInt(reader.nextLine());
        
        
        
        System.out.println("Type your name:");
        String secondName = reader.nextLine();
        
        System.out.println("Type your age:");
        int secondAge = Integer. parseInt(reader.nextLine());
        
        int result = firstAge + secondAge;
        
        System.out.println(firstName + " and " + secondName + " are " + result + " years old in total.");
    }
}
